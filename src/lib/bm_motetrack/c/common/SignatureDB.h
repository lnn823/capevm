#ifndef SIGNATUREDB_H
#define SIGNATUREDB_H
#include "RefSignature.h"

// ===================== signatureDB Database ===================================
#define SIGNATUREDB_SIZE 74

static const RefSignature signatureDB[] PROGMEM = {
    {{169 , 226, 0}, {801, {{1, {{27}, {23}}}, {3 , {{32}, {32}}}, {11, {{24}, {21}}}, {13, {{28}, {25}}}, {21, {{0} , {10}}}, {22, {{35}, {22}}}, {23, {{12}, {25}}}, {30, {{7} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{169 , 273, 0}, {802, {{1, {{11}, {24}}}, {3 , {{35}, {27}}}, {11, {{20}, {25}}}, {13, {{33}, {31}}}, {21, {{7} , {10}}}, {22, {{32}, {35}}}, {23, {{19}, {10}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{233 , 275, 0}, {803, {{1, {{26}, {25}}}, {3 , {{23}, {25}}}, {11, {{29}, {34}}}, {13, {{26}, {26}}}, {21, {{14}, {11}}}, {22, {{33}, {23}}}, {23, {{26}, {26}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{232 , 227, 0}, {804, {{1, {{32}, {34}}}, {3 , {{30}, {21}}}, {11, {{26}, {20}}}, {13, {{36}, {31}}}, {20, {{0} , {11}}}, {21, {{12}, {9}}} , {22, {{26}, {27}}}, {23, {{23}, {19}}}, {26, {{0} , {13}}}, {30, {{0} , {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{348 , 226, 0}, {805, {{1, {{25}, {32}}}, {3 , {{14}, {16}}}, {11, {{21}, {21}}}, {12, {{10}, {0}}} , {13, {{12}, {20}}}, {21, {{18}, {18}}}, {22, {{20}, {28}}}, {23, {{19}, {36}}}, {26, {{18}, {11}}}, {30, {{0} , {16}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{425 , 226, 0}, {806, {{1, {{23}, {18}}}, {3 , {{9} , {18}}}, {9 , {{8} , {0}}} , {11, {{10}, {18}}}, {12, {{9} , {8}}} , {13, {{17}, {9}}} , {21, {{17}, {26}}}, {22, {{19}, {16}}}, {23, {{26}, {24}}}, {26, {{18}, {0}}} , {30, {{0} , {17}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{503 , 309, 0}, {807, {{1, {{22}, {23}}}, {3 , {{12}, {0}}} , {5 , {{7} , {8}}} , {9 , {{16}, {22}}}, {11, {{9} , {12}}}, {13, {{0} , {9}}} , {16, {{9} , {11}}}, {21, {{32}, {32}}}, {22, {{14}, {0}}} , {23, {{15}, {18}}}, {26, {{30}, {27}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{505 , 402, 0}, {808, {{1, {{33}, {34}}}, {3 , {{16}, {16}}}, {5 , {{0} , {8}}} , {6 , {{15}, {0}}} , {9 , {{20}, {22}}}, {11, {{18}, {16}}}, {16, {{14}, {12}}}, {20, {{7} , {0}}} , {21, {{36}, {41}}}, {22, {{7} , {0}}} , {23, {{16}, {11}}}, {26, {{28}, {30}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{506 , 490, 0}, {809, {{1, {{26}, {18}}}, {3 , {{12}, {0}}} , {5 , {{12}, {0}}} , {6 , {{8} , {0}}} , {9 , {{28}, {26}}}, {11, {{17}, {16}}}, {16, {{22}, {11}}}, {20, {{0} , {8}}} , {21, {{29}, {31}}}, {23, {{0} , {13}}}, {26, {{34}, {32}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{436 , 572, 0}, {810, {{1, {{19}, {22}}}, {2 , {{9} , {0}}} , {3 , {{0} , {9}}} , {4 , {{7} , {0}}} , {5 , {{14}, {21}}}, {6 , {{11}, {14}}}, {9 , {{24}, {24}}}, {11, {{10}, {14}}}, {16, {{22}, {22}}}, {20, {{14}, {11}}}, {21, {{10}, {18}}}, {24, {{7} , {10}}}, {26, {{15}, {31}}}, {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{517 , 572, 0}, {811, {{1, {{23}, {23}}}, {2 , {{7} , {17}}}, {3 , {{7} , {0}}} , {5 , {{16}, {12}}}, {6 , {{11}, {14}}}, {9 , {{26}, {32}}}, {11, {{8} , {12}}}, {16, {{18}, {17}}}, {20, {{16}, {15}}}, {21, {{30}, {24}}}, {23, {{11}, {0}}} , {26, {{28}, {34}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{638 , 572, 0}, {812, {{1, {{11}, {19}}}, {2 , {{16}, {16}}}, {5 , {{13}, {10}}}, {6 , {{14}, {26}}}, {9 , {{38}, {13}}}, {16, {{19}, {32}}}, {20, {{16}, {12}}}, {21, {{26}, {29}}}, {24, {{15}, {8}}} , {26, {{22}, {22}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{708 , 572, 0}, {813, {{1, {{14}, {13}}}, {2 , {{12}, {24}}}, {5 , {{28}, {27}}}, {6 , {{22}, {17}}}, {9 , {{35}, {30}}}, {16, {{26}, {30}}}, {20, {{20}, {9}}} , {21, {{28}, {18}}}, {24, {{9} , {12}}}, {26, {{25}, {17}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{827 , 572, 0}, {814, {{2, {{20}, {17}}}, {4 , {{10}, {0}}} , {5 , {{29}, {37}}}, {6 , {{31}, {26}}}, {9 , {{23}, {22}}}, {16, {{13}, {24}}}, {19, {{10}, {0}}} , {20, {{23}, {18}}}, {21, {{15}, {7}}} , {24, {{8} , {15}}}, {26, {{7} , {18}}}, {28, {{8} , {0}}} , {30, {{0} , {10}}}, {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{899 , 572, 0}, {815, {{2, {{23}, {11}}}, {4 , {{0} , {11}}}, {5 , {{31}, {20}}}, {6 , {{30}, {12}}}, {9 , {{20}, {20}}}, {12, {{0} , {9}}} , {16, {{19}, {19}}}, {19, {{12}, {10}}}, {20, {{24}, {29}}}, {21, {{11}, {9}}} , {24, {{16}, {0}}} , {26, {{11}, {16}}}, {28, {{13}, {9}}} , {30, {{7} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{972 , 572, 0}, {816, {{2, {{30}, {24}}}, {4 , {{14}, {7}}} , {5 , {{38}, {42}}}, {6 , {{21}, {19}}}, {7 , {{8} , {0}}} , {9 , {{18}, {16}}}, {16, {{17}, {17}}}, {19, {{18}, {7}}} , {20, {{23}, {34}}}, {24, {{19}, {13}}}, {26, {{9} , {9}}} , {30, {{11}, {17}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1093, 572, 0}, {817, {{2, {{35}, {31}}}, {4 , {{11}, {15}}}, {5 , {{31}, {22}}}, {6 , {{14}, {18}}}, {9 , {{11}, {8}}} , {12, {{10}, {10}}}, {20, {{30}, {37}}}, {24, {{15}, {17}}}, {26, {{9} , {9}}} , {28, {{15}, {11}}}, {30, {{8} , {7}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1161, 572, 0}, {818, {{2, {{29}, {18}}}, {4 , {{20}, {16}}}, {5 , {{24}, {19}}}, {6 , {{11}, {11}}}, {7 , {{6} , {0}}} , {9 , {{10}, {0}}} , {12, {{13}, {10}}}, {18, {{10}, {0}}} , {19, {{18}, {22}}}, {20, {{32}, {27}}}, {24, {{24}, {22}}}, {28, {{15}, {26}}}, {30, {{17}, {20}}}, {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1282, 572, 0}, {819, {{2, {{10}, {20}}}, {4 , {{15}, {26}}}, {5 , {{18}, {12}}}, {6 , {{8} , {0}}} , {7 , {{11}, {12}}}, {9 , {{8} , {8}}} , {12, {{13}, {20}}}, {18, {{19}, {15}}}, {19, {{18}, {13}}}, {20, {{22}, {14}}}, {24, {{26}, {31}}}, {26, {{8} , {0}}} , {28, {{24}, {14}}}, {30, {{18}, {22}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1350, 572, 0}, {820, {{2, {{10}, {20}}}, {4 , {{32}, {30}}}, {5 , {{16}, {15}}}, {6 , {{8} , {0}}} , {7 , {{12}, {0}}} , {9 , {{9} , {0}}} , {12, {{20}, {23}}}, {16, {{7} , {0}}} , {18, {{22}, {22}}}, {19, {{18}, {18}}}, {20, {{11}, {19}}}, {24, {{24}, {29}}}, {28, {{24}, {19}}}, {30, {{26}, {21}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1472, 572, 0}, {821, {{4, {{19}, {28}}}, {5 , {{9} , {10}}}, {7 , {{8} , {24}}}, {12, {{11}, {11}}}, {18, {{12}, {26}}}, {19, {{34}, {12}}}, {20, {{8} , {13}}}, {24, {{33}, {32}}}, {28, {{0} , {13}}}, {30, {{14}, {13}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1540, 571, 0}, {822, {{2, {{8} , {0}}} , {4 , {{17}, {11}}}, {5 , {{15}, {8}}} , {7 , {{23}, {25}}}, {12, {{7} , {9}}} , {18, {{26}, {20}}}, {19, {{26}, {22}}}, {20, {{10}, {14}}}, {24, {{32}, {33}}}, {28, {{0} , {9}}} , {30, {{9} , {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1659, 572, 0}, {823, {{2, {{9} , {0}}} , {4 , {{10}, {13}}}, {5 , {{16}, {0}}} , {7 , {{16}, {24}}}, {9 , {{7} , {0}}} , {18, {{23}, {24}}}, {19, {{22}, {21}}}, {20, {{7} , {9}}} , {24, {{40}, {45}}}, {30, {{6} , {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1730, 572, 0}, {824, {{4, {{10}, {9}}} , {5 , {{10}, {11}}}, {7 , {{26}, {28}}}, {18, {{15}, {11}}}, {19, {{15}, {20}}}, {20, {{10}, {11}}}, {24, {{28}, {15}}}, {30, {{9} , {10}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1848, 572, 0}, {825, {{2, {{7} , {10}}}, {4 , {{9} , {9}}} , {5 , {{8} , {8}}} , {7 , {{24}, {21}}}, {9 , {{0} , {8}}} , {18, {{8} , {10}}}, {19, {{8} , {13}}}, {24, {{32}, {21}}}, {30, {{9} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{898 , 452, 0}, {826, {{2, {{13}, {12}}}, {5 , {{25}, {26}}}, {6 , {{12}, {15}}}, {12, {{0} , {12}}}, {16, {{12}, {0}}} , {20, {{31}, {33}}}, {21, {{13}, {12}}}, {26, {{10}, {12}}}, {30, {{10}, {8}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{894 , 332, 0}, {827, {{1, {{7} , {0}}} , {2 , {{10}, {8}}} , {5 , {{22}, {20}}}, {6 , {{18}, {8}}} , {9 , {{0} , {11}}}, {12, {{10}, {0}}} , {16, {{8} , {0}}} , {20, {{21}, {28}}}, {21, {{16}, {16}}}, {26, {{0} , {10}}}, {30, {{16}, {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{898 , 249, 0}, {828, {{2, {{0} , {8}}} , {5 , {{11}, {10}}}, {6 , {{0} , {8}}} , {9 , {{9} , {0}}} , {12, {{8} , {11}}}, {20, {{29}, {16}}}, {21, {{11}, {14}}}, {23, {{7} , {0}}} , {30, {{15}, {20}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{832 , 225, 0}, {829, {{1, {{7} , {8}}} , {5 , {{12}, {9}}} , {6 , {{0} , {9}}} , {9 , {{7} , {0}}} , {12, {{21}, {12}}}, {19, {{0} , {9}}} , {20, {{18}, {19}}}, {21, {{16}, {16}}}, {30, {{23}, {20}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{714 , 226, 0}, {830, {{1, {{0} , {11}}}, {5 , {{7} , {0}}} , {9 , {{9} , {9}}} , {12, {{12}, {18}}}, {13, {{0} , {7}}} , {19, {{7} , {0}}} , {20, {{0} , {20}}}, {21, {{23}, {32}}}, {22, {{10}, {0}}} , {23, {{16}, {9}}} , {26, {{18}, {12}}}, {30, {{18}, {18}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{631 , 226, 0}, {831, {{1, {{13}, {14}}}, {3 , {{0} , {8}}} , {5 , {{0} , {8}}} , {9 , {{10}, {7}}} , {12, {{12}, {15}}}, {13, {{0} , {10}}}, {19, {{10}, {10}}}, {20, {{12}, {14}}}, {21, {{24}, {27}}}, {22, {{9} , {0}}} , {23, {{14}, {20}}}, {26, {{17}, {15}}}, {30, {{10}, {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{587 , 226, 0}, {832, {{1, {{8} , {9}}} , {3 , {{0} , {8}}} , {11, {{0} , {9}}} , {12, {{10}, {15}}}, {13, {{8} , {9}}} , {20, {{9} , {11}}}, {21, {{25}, {25}}}, {22, {{0} , {9}}} , {23, {{15}, {20}}}, {26, {{10}, {21}}}, {30, {{16}, {20}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{537 , 226, 0}, {833, {{1, {{13}, {11}}}, {3 , {{0} , {9}}} , {9 , {{8} , {9}}} , {11, {{8} , {9}}} , {12, {{9} , {10}}}, {13, {{14}, {8}}} , {21, {{21}, {30}}}, {22, {{18}, {8}}} , {23, {{11}, {26}}}, {26, {{8} , {10}}}, {30, {{21}, {15}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{896 , 130, 0}, {834, {{2, {{16}, {10}}}, {5 , {{9} , {19}}}, {6 , {{12}, {11}}}, {9 , {{6} , {0}}} , {12, {{12}, {0}}} , {16, {{0} , {6}}} , {19, {{0} , {10}}}, {20, {{26}, {19}}}, {21, {{10}, {0}}} , {23, {{7} , {0}}} , {30, {{9} , {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{985 , 226, 0}, {835, {{5, {{22}, {11}}}, {6 , {{15}, {13}}}, {9 , {{0} , {7}}} , {12, {{26}, {10}}}, {16, {{0} , {8}}} , {20, {{29}, {34}}}, {21, {{8} , {11}}}, {26, {{6} , {0}}} , {30, {{17}, {15}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1106, 226, 0}, {836, {{2, {{8} , {0}}} , {5 , {{12}, {12}}}, {6 , {{0} , {8}}} , {12, {{26}, {33}}}, {19, {{0} , {9}}} , {20, {{26}, {36}}}, {24, {{0} , {7}}} , {30, {{24}, {18}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{419 , 696, 0}, {900, {{1, {{17}, {12}}}, {3 , {{7} , {0}}} , {6 , {{7} , {0}}} , {9 , {{30}, {24}}}, {11, {{10}, {0}}} , {16, {{8} , {0}}} , {21, {{0} , {11}}}, {26, {{11}, {22}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{518 , 692, 0}, {901, {{1, {{13}, {0}}} , {6 , {{9} , {9}}} , {9 , {{38}, {25}}}, {16, {{22}, {20}}}, {21, {{21}, {17}}}, {26, {{16}, {17}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{625 , 689, 0}, {902, {{1, {{0} , {7}}} , {5 , {{15}, {12}}}, {6 , {{13}, {11}}}, {9 , {{44}, {42}}}, {11, {{7} , {0}}} , {16, {{25}, {25}}}, {20, {{7} , {0}}} , {21, {{11}, {18}}}, {26, {{25}, {25}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{719 , 692, 0}, {903, {{2, {{7} , {0}}} , {5 , {{11}, {25}}}, {6 , {{18}, {18}}}, {9 , {{38}, {31}}}, {16, {{45}, {45}}}, {20, {{9} , {19}}}, {21, {{18}, {20}}}, {26, {{20}, {26}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{794 , 691, 0}, {904, {{2, {{18}, {20}}}, {5 , {{25}, {22}}}, {6 , {{33}, {28}}}, {9 , {{27}, {22}}}, {16, {{24}, {32}}}, {20, {{25}, {10}}}, {21, {{18}, {10}}}, {26, {{11}, {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{983 , 695, 0}, {905, {{2, {{37}, {36}}}, {4 , {{11}, {0}}} , {5 , {{39}, {38}}}, {6 , {{22}, {26}}}, {9 , {{21}, {13}}}, {16, {{8} , {15}}}, {20, {{34}, {20}}}, {26, {{8} , {0}}} , {28, {{13}, {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1173, 695, 0}, {906, {{2, {{29}, {38}}}, {4 , {{26}, {23}}}, {5 , {{14}, {10}}}, {6 , {{11}, {8}}} , {12, {{9} , {12}}}, {18, {{8} , {0}}} , {19, {{8} , {9}}} , {20, {{23}, {24}}}, {24, {{0} , {10}}}, {28, {{28}, {21}}}, {30, {{12}, {13}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1266, 696, 0}, {907, {{2, {{10}, {11}}}, {4 , {{35}, {17}}}, {5 , {{16}, {13}}}, {6 , {{7} , {0}}} , {12, {{10}, {7}}} , {18, {{16}, {20}}}, {19, {{10}, {13}}}, {20, {{21}, {17}}}, {24, {{7} , {12}}}, {28, {{35}, {32}}}, {30, {{19}, {12}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1364, 696, 0}, {908, {{2, {{11}, {8}}} , {4 , {{45}, {44}}}, {5 , {{17}, {10}}}, {12, {{0} , {10}}}, {18, {{19}, {24}}}, {19, {{11}, {13}}}, {20, {{17}, {9}}} , {24, {{14}, {9}}} , {28, {{25}, {24}}}, {30, {{15}, {20}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1459, 693, 0}, {909, {{2, {{7} , {0}}} , {4 , {{24}, {31}}}, {5 , {{0} , {7}}} , {7 , {{0} , {8}}} , {12, {{9} , {8}}} , {18, {{43}, {29}}}, {19, {{19}, {17}}}, {20, {{0} , {8}}} , {24, {{19}, {24}}}, {28, {{17}, {14}}}, {30, {{8} , {8}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1553, 695, 0}, {910, {{4, {{15}, {21}}}, {7 , {{20}, {18}}}, {18, {{38}, {28}}}, {19, {{21}, {15}}}, {20, {{0} , {8}}} , {24, {{30}, {22}}}, {30, {{10}, {12}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1646, 693, 0}, {911, {{4, {{18}, {18}}}, {7 , {{23}, {34}}}, {18, {{27}, {27}}}, {19, {{23}, {10}}}, {24, {{18}, {38}}}, {28, {{7} , {0}}} , {30, {{11}, {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1742, 697, 0}, {912, {{4, {{0} , {10}}}, {7 , {{28}, {40}}}, {18, {{25}, {22}}}, {19, {{10}, {15}}}, {24, {{23}, {36}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1837, 692, 0}, {913, {{7, {{34}, {24}}}, {18, {{10}, {8}}} , {19, {{8} , {0}}} , {24, {{22}, {21}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1929, 692, 0}, {914, {{7, {{17}, {17}}}, {19, {{0} , {8}}} , {24, {{17}, {21}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1679, 436, 0}, {915, {{7, {{17}, {17}}}, {12, {{9} , {10}}}, {18, {{12}, {18}}}, {19, {{24}, {10}}}, {24, {{38}, {37}}}, {30, {{18}, {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1559, 437, 0}, {916, {{4, {{0} , {12}}}, {7 , {{15}, {9}}} , {12, {{22}, {22}}}, {18, {{12}, {14}}}, {19, {{29}, {29}}}, {20, {{11}, {11}}}, {24, {{35}, {37}}}, {30, {{21}, {21}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1270, 242, 0}, {917, {{4, {{0} , {10}}}, {12, {{45}, {40}}}, {19, {{25}, {29}}}, {20, {{24}, {20}}}, {24, {{10}, {13}}}, {30, {{28}, {38}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1369, 434, 0}, {918, {{2, {{8} , {10}}}, {4 , {{22}, {26}}}, {5 , {{9} , {0}}} , {12, {{29}, {25}}}, {18, {{14}, {8}}} , {19, {{29}, {37}}}, {20, {{20}, {25}}}, {24, {{20}, {21}}}, {28, {{8} , {0}}} , {30, {{29}, {27}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1461, 379, 0}, {919, {{4, {{22}, {9}}} , {5 , {{0} , {8}}} , {7 , {{0} , {8}}} , {12, {{25}, {31}}}, {18, {{15}, {0}}} , {19, {{39}, {36}}}, {20, {{22}, {12}}}, {24, {{26}, {26}}}, {28, {{0} , {8}}} , {30, {{37}, {27}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1234, 416, 0}, {920, {{2, {{16}, {9}}} , {4 , {{24}, {17}}}, {5 , {{10}, {10}}}, {6 , {{7} , {8}}} , {12, {{21}, {25}}}, {18, {{8} , {8}}} , {19, {{28}, {27}}}, {20, {{20}, {24}}}, {24, {{18}, {22}}}, {28, {{13}, {12}}}, {30, {{27}, {35}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{1097, 370, 0}, {921, {{2, {{14}, {23}}}, {4 , {{8} , {8}}} , {5 , {{24}, {15}}}, {6 , {{9} , {9}}} , {12, {{25}, {13}}}, {19, {{10}, {15}}}, {20, {{39}, {31}}}, {24, {{10}, {9}}} , {28, {{7} , {0}}} , {30, {{25}, {19}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{785 , 500, 0}, {922, {{1, {{8} , {12}}}, {2 , {{16}, {18}}}, {5 , {{30}, {29}}}, {6 , {{22}, {17}}}, {9 , {{17}, {20}}}, {16, {{21}, {21}}}, {19, {{7} , {0}}} , {20, {{31}, {22}}}, {21, {{21}, {19}}}, {24, {{10}, {0}}} , {26, {{32}, {22}}}, {30, {{0} , {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{624 , 471, 0}, {923, {{1, {{14}, {21}}}, {5 , {{11}, {19}}}, {6 , {{14}, {7}}} , {9 , {{37}, {28}}}, {11, {{0} , {14}}}, {16, {{19}, {12}}}, {20, {{7} , {17}}}, {21, {{29}, {34}}}, {26, {{26}, {31}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{620 , 383, 0}, {924, {{1, {{27}, {26}}}, {3 , {{8} , {0}}} , {5 , {{11}, {0}}} , {6 , {{9} , {0}}} , {9 , {{24}, {13}}}, {11, {{12}, {15}}}, {16, {{13}, {11}}}, {20, {{9} , {0}}} , {21, {{47}, {33}}}, {23, {{11}, {0}}} , {26, {{34}, {34}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{599 , 281, 0}, {925, {{1, {{21}, {10}}}, {9 , {{10}, {9}}} , {11, {{9} , {8}}} , {13, {{0} , {9}}} , {16, {{0} , {9}}} , {20, {{8} , {0}}} , {21, {{40}, {29}}}, {22, {{0} , {9}}} , {23, {{22}, {15}}}, {26, {{26}, {27}}}, {30, {{8} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{700 , 292, 0}, {926, {{1, {{20}, {15}}}, {9 , {{15}, {18}}}, {16, {{10}, {9}}} , {20, {{11}, {9}}} , {21, {{30}, {24}}}, {23, {{13}, {0}}} , {26, {{21}, {26}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{365 , 424, 0}, {927, {{1, {{30}, {41}}}, {3 , {{15}, {23}}}, {9 , {{17}, {9}}} , {11, {{24}, {29}}}, {13, {{12}, {16}}}, {16, {{7} , {0}}} , {21, {{27}, {25}}}, {22, {{16}, {10}}}, {23, {{16}, {12}}}, {26, {{21}, {16}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{425 , 423, 0}, {928, {{1, {{36}, {26}}}, {3 , {{16}, {11}}}, {9 , {{22}, {17}}}, {11, {{14}, {23}}}, {13, {{0} , {11}}}, {16, {{8} , {11}}}, {21, {{34}, {32}}}, {23, {{14}, {12}}}, {26, {{26}, {32}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{434 , 297, 0}, {929, {{1, {{23}, {10}}}, {3 , {{12}, {11}}}, {9 , {{12}, {11}}}, {11, {{16}, {25}}}, {13, {{12}, {13}}}, {21, {{8} , {22}}}, {22, {{9} , {13}}}, {23, {{27}, {27}}}, {26, {{17}, {22}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{234 , 413, 0}, {930, {{1, {{34}, {37}}}, {3 , {{38}, {31}}}, {9 , {{12}, {0}}} , {11, {{43}, {43}}}, {13, {{14}, {11}}}, {21, {{18}, {24}}}, {22, {{18}, {24}}}, {23, {{13}, {16}}}, {26, {{15}, {15}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{116 , 430, 0}, {931, {{1, {{24}, {20}}}, {3 , {{39}, {39}}}, {11, {{13}, {22}}}, {13, {{15}, {10}}}, {21, {{9} , {11}}}, {22, {{23}, {22}}}, {23, {{7} , {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{129 , 145, 0}, {932, {{1, {{19}, {10}}}, {3 , {{16}, {18}}}, {11, {{13}, {15}}}, {13, {{34}, {28}}}, {22, {{41}, {40}}}, {23, {{22}, {9}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{248 , 115, 0}, {933, {{1, {{17}, {0}}} , {3 , {{24}, {9}}} , {11, {{13}, {0}}} , {13, {{35}, {40}}}, {22, {{22}, {28}}}, {23, {{24}, {18}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{392 , 135, 0}, {934, {{1, {{17}, {21}}}, {3 , {{11}, {9}}} , {13, {{18}, {19}}}, {21, {{11}, {14}}}, {22, {{16}, {18}}}, {23, {{43}, {42}}}, {26, {{0} , {7}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{531 , 108, 0}, {935, {{1, {{12}, {9}}} , {11, {{9} , {7}}} , {13, {{9} , {8}}} , {21, {{13}, {12}}}, {22, {{0} , {7}}} , {23, {{28}, {23}}}, {26, {{11}, {11}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{619 , 116, 0}, {936, {{1, {{13}, {14}}}, {9 , {{0} , {9}}} , {13, {{10}, {0}}} , {21, {{34}, {24}}}, {22, {{7} , {8}}} , {23, {{19}, {11}}}, {26, {{9} , {9}}} , {30, {{0} , {7}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}},
    {{745 , 112, 0}, {937, {{5, {{9} , {7}}} , {6 , {{0} , {7}}} , {12, {{17}, {18}}}, {19, {{8} , {0}}} , {20, {{19}, {17}}}, {21, {{20}, {12}}}, {23, {{9} , {0}}} , {30, {{9} , {18}}}, {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0 , {{0} , {0}}} , {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}, {0, {{0}, {0}}}}}}
};


static inline void SignatureDB_get(RefSignature *refSigPtr, uint16_t indexDB) 
{ 
        memcpy_P(refSigPtr, (RefSignature*) &signatureDB[indexDB], sizeof(RefSignature)); 
} 

#endif
