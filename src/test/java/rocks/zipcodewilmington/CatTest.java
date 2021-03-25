package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat1.getName();
        Date retrievedBirthDate = cat1.getBirthDate();
        Integer retrievedId = cat1.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void  setNameTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        cat1.setName("Azula");
        String namePassedIn = cat1.getName();

        Assert.assertEquals("Azula", namePassedIn);

    }

    @Test
    public void  setNameTest2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        cat1.setName("Azula");
        String namePassedIn = cat1.getName();

        Assert.assertNotEquals("123", namePassedIn);

    }

    @Test
    public void  setBirthDateTest1() {
        // Given (cat data)
        String givenName = "Zula";
        Date newBirthdate = new Date();

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName);
        cat1.setBirthDate(newBirthdate);
        Date retrievedBirthDate = cat1.getBirthDate();

        Assert.assertEquals(newBirthdate, retrievedBirthDate);

    }

    @Test
    public void  setBirthDateTest2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        cat1.setBirthDate(newBirthdate);
        Date retrievedBirthDate = cat1.getBirthDate();

        Assert.assertNotEquals(5, retrievedBirthDate);

    }

    @Test
    public void speakTest1() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        String catTalk = cat1.speak();

        Assert.assertEquals("meow!", catTalk);
    }

    @Test
    public void speakTest2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        String catTalk = cat1.speak();

        Assert.assertNotEquals("woof!", catTalk);
    }

    @Test
    public void eatTest1() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Food tuna = new Food();
        cat1.eat(tuna);
        cat1.eat(tuna);
        int mealHolder = cat1.getNumberOfMealsEaten();

        Assert.assertEquals(2, mealHolder);
    }

    @Test
    public void eatTest2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Food tuna = new Food();
        cat1.eat(tuna);
        cat1.eat(tuna);
        cat1.eat(tuna);
        cat1.eat(tuna);
        int mealHolder = cat1.getNumberOfMealsEaten();

        Assert.assertEquals(4, mealHolder);
    }

    @Test
    public void getId1() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 8675369;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Integer returnedID = cat1.getId();

        Assert.assertEquals(givenId, returnedID);
    }

    @Test
    public void getId2() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);
        Integer returnedID = cat1.getId();

        Assert.assertEquals(givenId, returnedID);
    }

    @Test
    public void instanceOfAnimalTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat1 instanceof Mammal);
    }

    @Test
    public void instanceOfMammalTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Date newBirthdate = new Date();
        Integer givenId = 1793;

        // When (a cat is constructed)
        Cat cat1 = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat1 instanceof Animal);
    }

}
