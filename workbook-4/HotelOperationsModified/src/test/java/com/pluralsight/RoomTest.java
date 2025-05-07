package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void checkIn_SimpleRun_RoomSetToOccupiedAndDirty(){
        //Arrange
        Room room = new Room(1,135);

        //Act
        room.checkIn();
        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());


    }@Test
    public void checkOut_SimpleRun_RoomSetToNotOccupied(){
        //Arrange
        Room room1 = new Room(1,135);
        room1.checkIn();

        //Act
        room1.checkOut();

        //Assert
        assertFalse(room1.isOccupied());


    }@Test
    public void cleanRoom_SimpleRun_RoomSetToClean(){
        //Arrange
        Room room2 = new Room(1,135);
        room2.checkIn();
        room2.checkOut();

        //Act
        room2.cleanRoom();

        //Assert
        assertFalse(room2.isDirty());

    }

}