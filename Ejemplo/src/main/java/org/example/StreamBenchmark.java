package org.example;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@State(Scope.Thread)
public class StreamBenchmark {
    private List<Integer> list;

    @Setup(Level.Trial)
    public void setup() {
        list = new ArrayList<>();
        Random random = new Random();
        int size = 10_000_000; // Ajusta a 10 millones
        for (int i = 0; i < size; i++) {
            int randomNumber = 1 + random.nextInt(50000 - 1);
            list.add(randomNumber);
        }
    }

    @Benchmark
    public List<Integer> concurrencia() {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    @Benchmark
    public List<Integer> paralelismo() {
        return list.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(StreamBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(10)
                .forks(1)
                .build();

        new Runner(opt).run();
    }

}
