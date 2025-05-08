package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    public void punchIn_SimpleRun_CorrectPunchInTime(){
        //Arrange
        Employee Emanuel = new Employee(123,"Emanuel","Software",90);


        //Act
        Emanuel.punchIn(9);

        //Assert
        assertEquals(9,Emanuel.punchIn(9));
    }
    public void punchOut_SimpleRun_CorrectPunchOutTime(){
        //Arrange

        //Act

        //Assert

    }

}