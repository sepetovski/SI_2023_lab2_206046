package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {


    @Test
    public void testEveryBranch() {
        assertThrows(RuntimeException.class, () -> SILab2.function(null ,null));

        User user1 = new User(null, "password", "jani.stojcev@gmail.com");
        List<User> users = List.of(user1);
        assertFalse(SILab2.function(user1, users));

        User user2 = new User("angel", "pass", "angel.krstov@gmail.com");
        assertFalse(SILab2.function(user2, users));

        User user3 = new User("miki", "pass word", "miki.batandjiev@gmail.com");
        User user4 = new User("milan", "password", "milan.krstov@gmail.com");
        users = List.of(user4);
        assertFalse(SILab2.function(user3, users));

        User user5 = new User("tomba", "password123", "tomba.dzambazov@gmail.com");
        assertFalse(SILab2.function(user5, users));
    }

    @Test
    public void testMultipleConditionMissingInformation() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("damjan", "damjan123", null), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("damjan", null, "damjan.stalone@gmail.com"), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(new User("damjan", null, null), new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null, new ArrayList<>()));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

    }
}