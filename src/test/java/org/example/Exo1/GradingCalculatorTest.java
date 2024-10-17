package org.example.Exo1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.Stream;

public class GradingCalculatorTest {
    private GradingCalculator calculator;
    //    @Test
//    public void whenGetGrade_Score_95_Presence_90_Then_A() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(95, 90);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('A', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_85_Presence_90_Then_B() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(85, 90);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('B', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_65_Presence_90_Then_C() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(65, 90);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('C', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_95_Presence_65_Then_B() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(95, 65);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('B', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_95_Presence_55_Then_F() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(95, 55);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('F', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_65_Presence_55_Then_F() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(65, 55);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('F', result);
//    }
//
//    @Test
//    public void whenGetGrade_Score_50_Presence_90_Then_F() {
//        // Arrange
//        GradingCalculator gradingCalculator = new GradingCalculator(50, 90);
//
//        // Act
//        char result = gradingCalculator.getGrade();
//
//        // Assert
//        Assert.assertEquals('F', result);
//    }

    @ParameterizedTest
    //@MethodSource("provideArguments")
    @CsvSource({
            "95,90,A",
            "85,90,B",
            "65,90,C",
            "95,65,B",
            "95,55,F",
            "65,55,F",
            "50,90,F"
    })
    public void whenScore_andAttendancePercentage_Then_expectedGrade(int score,int attendancePercentage,char grade) {
        // Arrange
        calculator = new GradingCalculator(score,attendancePercentage);

        // Act
        char gradGet = calculator.getGrade();

        // Assert
        Assertions.assertEquals(grade, gradGet);
    }

    private static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(95,90,'A'),
                Arguments.of(85,90,'B'),
                Arguments.of(65,90,'C'),
                Arguments.of(95,65,'B'),
                Arguments.of(95,55,'F'),
                Arguments.of(65,55,'F'),
                Arguments.of(50,90,'F')
        );
    }
}
