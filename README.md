randomz
=======

Library of fast random number generation functions.

These are fast pseudo-random numbers intended for simulations, games etc. 

Cryptographic strength PRNG generation is not an objective. If you use Randomz 
for cryptography then don't blame me if you get hacked :-)

### Performance

The main advantage of Randomz is that it produces faster random numbers.

In fact, it can be over 150% faster than java.util.Random. See the Output 
from the Caliper-based performance Benchmark:

>     benchmark    ns linear runtime
>    JavaRandom 20.53 ==============================
>  MikeraRandom  7.63 ===========

Randomz achieves this by replacing the standard Java PRNG algorithm with the 
excellent XORShift algorithm by George Marsaglia.

### Features

Randomz provides:

 - A faster replacement for java.util.Random 
 - Various implementations of useful randomized algorithms