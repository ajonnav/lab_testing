package debug;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ContainerArrayTest {
    private ContainerArray<String> myContainer = null;

    @Before
    public void setUp () {
        myContainer = new ContainerArray<>();
    }
    
    @Test 
    public void testAddPastLimit (){
    	for(int i=0; i<10;i++) {
    		myContainer.add("Eagle");
    	}
        myContainer.add("Hawk");
        assertFalse(myContainer.contains("Hawk"));
    }

    @Test
    public void testSizeChangeWithAdd () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.add("Camel");
        assertEquals("Add size", 3, myContainer.size());
    }

    @Test
    public void testObjectIsStored () {
        String alligator = "Alligator";
        myContainer.add(alligator);
        assertTrue(myContainer.contains(alligator));
    }

    @Test
    public void testSizeChangeWithRemove () {
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Alligator");
        assertEquals("Remove size", 1, myContainer.size());
    }

    @Test
    public void testObjectIsRemoved () {
        String alligator = "Alligator";
        myContainer.add("Alligator");
        myContainer.add("Bear");
        myContainer.remove("Bear");
        assertFalse(myContainer.contains("Bear"));
    }
        
}
