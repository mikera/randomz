Randomz
=======

Library of fast random number generation functions.

These are fast, decent quality pseudo-random numbers intended for simulations, games etc. 

Cryptographic strength PRNG generation is not an objective. If you use Randomz 
for cryptography then don't blame me if you get hacked :-)

### Performance

The main advantage of Randomz is that it produces faster random numbers.

In fact, it can be over 150% faster than java.util.Random. See the output 
below from the Caliper-based performance Benchmark:

```
     benchmark    ns linear runtime
    JavaRandom 20.53 ==============================
  MikeraRandom  7.63 ===========
```

The `ns` timings above are effectively the time required to create a single `long`
random number - i.e. Randomz can create about *120 million* random longs per second.

Randomz achieves this high level of performance by replacing the standard Java PRNG
algorithm with the excellent XORShift algorithm by George Marsaglia.

### Features

Randomz provides:

 - A faster replacement for java.util.Random 
 - Various implementations of useful randomized algorithms