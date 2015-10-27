Feature: Roman Numerals

  Scenario Outline: Functional Tests For Roman Numerals
    When I generate roman numeral for <inputNo>
    Then the result is <romanNumeral>

    Examples:
    |inputNo |romanNumeral |
    |1       |"I"          |
    |2       |"II"         |
    |3       |"III"        |
    |4       |"IV"         |
    |5       |"V"          |
    |6       |"VI"         |
    |7       |"VII"        |
    |8       |"VIII"       |
    |9       |"IX"         |
    |10      |"X"          |
    |11      |"XI"         |
    |24      |"XXIV"       |
    |99      |"XCIX"       |