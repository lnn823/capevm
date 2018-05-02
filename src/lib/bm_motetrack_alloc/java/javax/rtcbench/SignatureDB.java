package javax.rtcbench;

import javax.rtc.*;

public class SignatureDB {
    @ConstArray
    public static class X {
        public final static short[] data = { 169 };
    }

    @ConstArray
    public static class Y {
        public final static short[] data = { 226 };
    }

    @ConstArray
    public static class Z {
        public final static short[] data = {   0 };
    }

    @ConstArray
    public static class SigID {
        public final static short[] data = { 801 };
    }

    @ConstArray
    public static class SourceID {
        public final static short[] data = {  1 ,  3 , 11 , 13 , 21 , 22 , 23 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 };
    }

    @ConstArray
    public static class Rssi0 {
        public final static byte[]  data = { 27 , 32 , 24 , 28 ,  0 , 35 , 12 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 };
    }

    @ConstArray
    public static class Rssi1 {
        public final static byte[]  data = { 23 , 32 , 21 , 25 , 10 , 22 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 };
    }
}



// public class SignatureDB {
//     @ConstArray
//     public static class X {
//         public final static short[] data = { 169 ,169 ,233 ,232 ,348 ,425 ,503 ,505 ,506 ,436 ,517 ,638 ,708 ,827 ,899 ,972 ,1093,1161,1282,1350,1472,1540,1659,1730,1848,898 ,894 ,898 ,832 ,714 ,631 ,587 ,537 ,896 ,985 ,1106,419 ,518 ,625 ,719 ,794 ,983 ,1173,1266,1364,1459,1553,1646,1742,1837,1929,1679,1559,1270,1369,1461,1234,1097,785 ,624 ,620 ,599 ,700 ,365 ,425 ,434 ,234 ,116 ,129 ,248 ,392 ,531 ,619 ,745};
//     }

//     @ConstArray
//     public static class Y {
//         public final static short[] data = { 226, 273, 275, 227, 226, 226, 309, 402, 490, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 572, 571, 572, 572, 572, 452, 332, 249, 225, 226, 226, 226, 226, 130, 226, 226, 696, 692, 689, 692, 691, 695, 695, 696, 696, 693, 695, 693, 697, 692, 692, 436, 437, 242, 434, 379, 416, 370, 500, 471, 383, 281, 292, 424, 423, 297, 413, 430, 145, 115, 135, 108, 116, 112};
//     }

//     @ConstArray
//     public static class Z {
//         public final static short[] data = {   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0,   0};
//     }

//     @ConstArray
//     public static class SigID {
//         public final static short[] data = { 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 813, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 826, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 900, 901, 902, 903, 904, 905, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937};
//     }

//     @ConstArray
//     public static class SourceID {
//         public final static short[] data = {  1 ,  3 , 11 , 13 , 21 , 22 , 23 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 21 , 22 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 21 , 22 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 20 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 12 , 13 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 12 , 13 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  5 ,  9 , 11 , 13 , 16 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  3 ,  4 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 24 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  3 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  5 ,  6 ,  9 , 16 , 20 , 21 , 24 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  5 ,  6 ,  9 , 16 , 20 , 21 , 24 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  9 , 16 , 19 , 20 , 21 , 24 , 26 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  9 , 12 , 16 , 19 , 20 , 21 , 24 , 26 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  7 ,  9 , 16 , 19 , 20 , 24 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  9 , 12 , 20 , 24 , 26 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  7 ,  9 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  7 ,  9 , 12 , 18 , 19 , 20 , 24 , 26 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  7 ,  9 , 12 , 16 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  4 ,  5 ,  7 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  7 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  7 ,  9 , 18 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  5 ,  7 , 18 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  7 ,  9 , 18 , 19 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 , 12 , 16 , 20 , 21 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  5 ,  6 ,  9 , 12 , 16 , 20 , 21 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 ,  9 , 12 , 20 , 21 , 23 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  5 ,  6 ,  9 , 12 , 19 , 20 , 21 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  5 ,  9 , 12 , 13 , 19 , 20 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  5 ,  9 , 12 , 13 , 19 , 20 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 12 , 13 , 20 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 12 , 13 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 ,  9 , 12 , 16 , 19 , 20 , 21 , 23 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  5 ,  6 ,  9 , 12 , 16 , 20 , 21 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 , 12 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  6 ,  9 , 11 , 16 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  6 ,  9 , 16 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 ,  9 , 16 , 20 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  5 ,  6 ,  9 , 16 , 20 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 ,  9 , 16 , 20 , 26 , 28 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  7 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  7 , 18 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  7 , 18 , 19 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  7 , 18 , 19 , 24 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 18 , 19 , 24 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 19 , 24 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 12 , 18 , 19 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  7 , 12 , 18 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 , 12 , 19 , 20 , 24 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  4 ,  5 ,  7 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 , 12 , 18 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  2 ,  4 ,  5 ,  6 , 12 , 19 , 20 , 24 , 28 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  2 ,  5 ,  6 ,  9 , 16 , 19 , 20 , 21 , 24 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  5 ,  6 ,  9 , 11 , 16 , 20 , 21 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  9 , 11 , 13 , 16 , 20 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  9 , 16 , 20 , 21 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 13 , 16 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 13 , 16 , 21 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 13 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 ,  9 , 11 , 13 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 21 , 22 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 22 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 11 , 13 , 22 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  3 , 13 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 , 11 , 13 , 21 , 22 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  1 ,  9 , 13 , 21 , 22 , 23 , 26 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  5 ,  6 , 12 , 19 , 20 , 21 , 23 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0};
//     }

//     @ConstArray
//     public static class Rssi0 {
//         public final static byte[]  data = { 27 , 32 , 24 , 28 ,  0 , 35 , 12 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 35 , 20 , 33 ,  7 , 32 , 19 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 26 , 23 , 29 , 26 , 14 , 33 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 32 , 30 , 26 , 36 ,  0 , 12 , 26 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 25 , 14 , 21 , 10 , 12 , 18 , 20 , 19 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 ,  9 ,  8 , 10 ,  9 , 17 , 17 , 19 , 26 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 22 , 12 ,  7 , 16 ,  9 ,  0 ,  9 , 32 , 14 , 15 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 33 , 16 ,  0 , 15 , 20 , 18 , 14 ,  7 , 36 ,  7 , 16 , 28 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 26 , 12 , 12 ,  8 , 28 , 17 , 22 ,  0 , 29 ,  0 , 34 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 19 ,  9 ,  0 ,  7 , 14 , 11 , 24 , 10 , 22 , 14 , 10 ,  7 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 ,  7 ,  7 , 16 , 11 , 26 ,  8 , 18 , 16 , 30 , 11 , 28 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 16 , 13 , 14 , 38 , 19 , 16 , 26 , 15 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 14 , 12 , 28 , 22 , 35 , 26 , 20 , 28 ,  9 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 20 , 10 , 29 , 31 , 23 , 13 , 10 , 23 , 15 ,  8 ,  7 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 ,  0 , 31 , 30 , 20 ,  0 , 19 , 12 , 24 , 11 , 16 , 11 , 13 ,  7 ,  0 ,  0 ,  0 ,  0 , 30 , 14 , 38 , 21 ,  8 , 18 , 17 , 18 , 23 , 19 ,  9 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 35 , 11 , 31 , 14 , 11 , 10 , 30 , 15 ,  9 , 15 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 29 , 20 , 24 , 11 ,  6 , 10 , 13 , 10 , 18 , 32 , 24 , 15 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 15 , 18 ,  8 , 11 ,  8 , 13 , 19 , 18 , 22 , 26 ,  8 , 24 , 18 ,  0 ,  0 ,  0 ,  0 , 10 , 32 , 16 ,  8 , 12 ,  9 , 20 ,  7 , 22 , 18 , 11 , 24 , 24 , 26 ,  0 ,  0 ,  0 ,  0 , 19 ,  9 ,  8 , 11 , 12 , 34 ,  8 , 33 ,  0 , 14 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 17 , 15 , 23 ,  7 , 26 , 26 , 10 , 32 ,  0 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 , 10 , 16 , 16 ,  7 , 23 , 22 ,  7 , 40 ,  6 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 10 , 26 , 15 , 15 , 10 , 28 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 ,  9 ,  8 , 24 ,  0 ,  8 ,  8 , 32 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 , 25 , 12 ,  0 , 12 , 31 , 13 , 10 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 10 , 22 , 18 ,  0 , 10 ,  8 , 21 , 16 ,  0 , 16 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 ,  0 ,  9 ,  8 , 29 , 11 ,  7 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 12 ,  0 ,  7 , 21 ,  0 , 18 , 16 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 ,  9 , 12 ,  0 ,  7 ,  0 , 23 , 10 , 16 , 18 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 ,  0 ,  0 , 10 , 12 ,  0 , 10 , 12 , 24 ,  9 , 14 , 17 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 ,  0 ,  0 , 10 ,  8 ,  9 , 25 ,  0 , 15 , 10 , 16 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 ,  0 ,  8 ,  8 ,  9 , 14 , 21 , 18 , 11 ,  8 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 16 ,  9 , 12 ,  6 , 12 ,  0 ,  0 , 26 , 10 ,  7 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 22 , 15 ,  0 , 26 ,  0 , 29 ,  8 ,  6 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 12 ,  0 , 26 ,  0 , 26 ,  0 , 24 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 ,  7 ,  7 , 30 , 10 ,  8 ,  0 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 ,  9 , 38 , 22 , 21 , 16 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 15 , 13 , 44 ,  7 , 25 ,  7 , 11 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 11 , 18 , 38 , 45 ,  9 , 18 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 , 25 , 33 , 27 , 24 , 25 , 18 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 37 , 11 , 39 , 22 , 21 ,  8 , 34 ,  8 , 13 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 29 , 26 , 14 , 11 ,  9 ,  8 ,  8 , 23 ,  0 , 28 , 12 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 35 , 16 ,  7 , 10 , 16 , 10 , 21 ,  7 , 35 , 19 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 45 , 17 ,  0 , 19 , 11 , 17 , 14 , 25 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 24 ,  0 ,  0 ,  9 , 43 , 19 ,  0 , 19 , 17 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 15 , 20 , 38 , 21 ,  0 , 30 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 , 23 , 27 , 23 , 18 ,  7 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 28 , 25 , 10 , 23 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 34 , 10 ,  8 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 ,  0 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 ,  9 , 12 , 24 , 38 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 15 , 22 , 12 , 29 , 11 , 35 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 45 , 25 , 24 , 10 , 28 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 22 ,  9 , 29 , 14 , 29 , 20 , 20 ,  8 , 29 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 22 ,  0 ,  0 , 25 , 15 , 39 , 22 , 26 ,  0 , 37 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 16 , 24 , 10 ,  7 , 21 ,  8 , 28 , 20 , 18 , 13 , 27 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 14 ,  8 , 24 ,  9 , 25 , 10 , 39 , 10 ,  7 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 16 , 30 , 22 , 17 , 21 ,  7 , 31 , 21 , 10 , 32 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 14 , 11 , 14 , 37 ,  0 , 19 ,  7 , 29 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 27 ,  8 , 11 ,  9 , 24 , 12 , 13 ,  9 , 47 , 11 , 34 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 21 , 10 ,  9 ,  0 ,  0 ,  8 , 40 ,  0 , 22 , 26 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 20 , 15 , 10 , 11 , 30 , 13 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 30 , 15 , 17 , 24 , 12 ,  7 , 27 , 16 , 16 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 36 , 16 , 22 , 14 ,  0 ,  8 , 34 , 14 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 , 12 , 12 , 16 , 12 ,  8 ,  9 , 27 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 34 , 38 , 12 , 43 , 14 , 18 , 18 , 13 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 24 , 39 , 13 , 15 ,  9 , 23 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 19 , 16 , 13 , 34 , 41 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 , 24 , 13 , 35 , 22 , 24 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 , 11 , 18 , 11 , 16 , 43 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 ,  9 ,  9 , 13 ,  0 , 28 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 ,  0 , 10 , 34 ,  7 , 19 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 ,  0 , 17 ,  8 , 19 , 20 ,  9 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0};
//     }

//     @ConstArray
//     public static class Rssi1 {
//         public final static byte[]  data = { 23 , 32 , 21 , 25 , 10 , 22 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 24 , 27 , 25 , 31 , 10 , 35 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 25 , 25 , 34 , 26 , 11 , 23 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 34 , 21 , 20 , 31 , 11 ,  9 , 27 , 19 , 13 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 32 , 16 , 21 ,  0 , 20 , 18 , 28 , 36 , 11 , 16 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 , 18 ,  0 , 18 ,  8 ,  9 , 26 , 16 , 24 ,  0 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 ,  0 ,  8 , 22 , 12 ,  9 , 11 , 32 ,  0 , 18 , 27 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 34 , 16 ,  8 ,  0 , 22 , 16 , 12 ,  0 , 41 ,  0 , 11 , 30 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 ,  0 ,  0 ,  0 , 26 , 16 , 11 ,  8 , 31 , 13 , 32 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 22 ,  0 ,  9 ,  0 , 21 , 14 , 24 , 14 , 22 , 11 , 18 , 10 , 31 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 , 17 ,  0 , 12 , 14 , 32 , 12 , 17 , 15 , 24 ,  0 , 34 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 19 , 16 , 10 , 26 , 13 , 32 , 12 , 29 ,  8 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 , 24 , 27 , 17 , 30 , 30 ,  9 , 18 , 12 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 ,  0 , 37 , 26 , 22 , 24 ,  0 , 18 ,  7 , 15 , 18 ,  0 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 11 , 20 , 12 , 20 ,  9 , 19 , 10 , 29 ,  9 ,  0 , 16 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 , 24 ,  7 , 42 , 19 ,  0 , 16 , 17 ,  7 , 34 , 13 ,  9 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 31 , 15 , 22 , 18 ,  8 , 10 , 37 , 17 ,  9 , 11 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 , 16 , 19 , 11 ,  0 ,  0 , 10 ,  0 , 22 , 27 , 22 , 26 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 , 20 , 26 , 12 ,  0 , 12 ,  8 , 20 , 15 , 13 , 14 , 31 ,  0 , 14 , 22 ,  0 ,  0 ,  0 ,  0 , 20 , 30 , 15 ,  0 ,  0 ,  0 , 23 ,  0 , 22 , 18 , 19 , 29 , 19 , 21 ,  0 ,  0 ,  0 ,  0 , 28 , 10 , 24 , 11 , 26 , 12 , 13 , 32 , 13 , 13 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 ,  8 , 25 ,  9 , 20 , 22 , 14 , 33 ,  9 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 13 ,  0 , 24 ,  0 , 24 , 21 ,  9 , 45 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 , 11 , 28 , 11 , 20 , 11 , 15 , 10 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 ,  9 ,  8 , 21 ,  8 , 10 , 13 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 , 26 , 15 , 12 ,  0 , 33 , 12 , 12 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 20 ,  8 , 11 ,  0 ,  0 , 28 , 16 , 10 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 10 ,  8 ,  0 , 11 , 16 , 14 ,  0 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 ,  9 ,  9 ,  0 , 12 ,  9 , 19 , 16 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 ,  0 ,  9 , 18 ,  7 ,  0 , 20 , 32 ,  0 ,  9 , 12 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 14 ,  8 ,  8 ,  7 , 15 , 10 , 10 , 14 , 27 ,  0 , 20 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 ,  8 ,  9 , 15 ,  9 , 11 , 25 ,  9 , 20 , 21 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 ,  9 ,  9 ,  9 , 10 ,  8 , 30 ,  8 , 26 , 10 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 19 , 11 ,  0 ,  0 ,  6 , 10 , 19 ,  0 ,  0 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 13 ,  7 , 10 ,  8 , 34 , 11 ,  0 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 ,  8 , 33 ,  9 , 36 ,  7 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 ,  0 ,  0 , 24 ,  0 ,  0 , 11 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 , 25 , 20 , 17 , 17 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 , 12 , 11 , 42 ,  0 , 25 ,  0 , 18 , 25 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 25 , 18 , 31 , 45 , 19 , 20 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 20 , 22 , 28 , 22 , 32 , 10 , 10 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 36 ,  0 , 38 , 26 , 13 , 15 , 20 ,  0 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 38 , 23 , 10 ,  8 , 12 ,  0 ,  9 , 24 , 10 , 21 , 13 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 11 , 17 , 13 ,  0 ,  7 , 20 , 13 , 17 , 12 , 32 , 12 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  8 , 44 , 10 , 10 , 24 , 13 ,  9 ,  9 , 24 , 20 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 31 ,  7 ,  8 ,  8 , 29 , 17 ,  8 , 24 , 14 ,  8 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 21 , 18 , 28 , 15 ,  8 , 22 , 12 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 18 , 34 , 27 , 10 , 38 ,  0 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 40 , 22 , 15 , 36 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 24 ,  8 ,  0 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 ,  8 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 17 , 10 , 18 , 10 , 37 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 ,  9 , 22 , 14 , 29 , 11 , 37 , 21 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 40 , 29 , 20 , 13 , 38 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 26 ,  0 , 25 ,  8 , 37 , 25 , 21 ,  0 , 27 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 ,  8 ,  8 , 31 ,  0 , 36 , 12 , 26 ,  8 , 27 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 , 17 , 10 ,  8 , 25 ,  8 , 27 , 24 , 22 , 12 , 35 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 23 ,  8 , 15 ,  9 , 13 , 15 , 31 ,  9 ,  0 , 19 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 12 , 18 , 29 , 17 , 20 , 21 ,  0 , 22 , 19 ,  0 , 22 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 21 , 19 ,  7 , 28 , 14 , 12 , 17 , 34 , 31 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 26 ,  0 ,  0 ,  0 , 13 , 15 , 11 ,  0 , 33 ,  0 , 34 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 ,  9 ,  8 ,  9 ,  9 ,  0 , 29 ,  9 , 15 , 27 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 15 , 18 ,  9 ,  9 , 24 ,  0 , 26 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 41 , 23 ,  9 , 29 , 16 ,  0 , 25 , 10 , 12 , 16 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 26 , 11 , 17 , 23 , 11 , 11 , 32 , 12 , 32 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 11 , 11 , 25 , 13 , 22 , 13 , 27 , 22 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 37 , 31 ,  0 , 43 , 11 , 24 , 24 , 16 , 15 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 20 , 39 , 22 , 10 , 11 , 22 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 10 , 18 , 15 , 28 , 40 ,  9 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 ,  0 , 40 , 28 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 21 ,  9 , 19 , 14 , 18 , 42 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  9 ,  7 ,  8 , 12 ,  7 , 23 , 11 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 , 14 ,  9 ,  0 , 24 ,  8 , 11 ,  9 ,  7 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  7 ,  7 , 18 ,  0 , 17 , 12 ,  0 , 18 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0 ,  0};
//     }
// }








