package LifeGame;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CellTest {
    private static Cell cell=new Cell(5,5);
	
    
    
    
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
		 for (int i = 0; i <= cell.maxLength+1; i++)
		  {
	       for (int j = 0; j <= cell.maxWidth+1; j++)
	             {
	    	       cell.grid[i][j] = 0;
	              }
		  }
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	}
	@Before
    public void setUp() throws Exception {
		for (int i = 0; i <= cell.maxLength+1; i++)
		  {
	       for (int j = 0; j <= cell.maxWidth+1; j++)
	             {
	    	       cell.grid[i][j] = 0;
	              }
		  }
    }
    
	@Test
	public void testgetNeighborCount() {
		cell.getNeighborCount(2, 2);
		assertEquals(0,cell.getNeighborCount(2, 2));
	}
	@Test
	public void testgetNeighborCount2() {
		cell.grid[1][2]=1;
		cell.grid[1][3]=1;
		cell.grid[1][1]=1;
		assertEquals(2,cell.getNeighborCount(1, 2));
	}
	@Test
	public void testdelete() {
		 for (int i = 0; i <= cell.maxLength+1; i++)
		  {
	       for (int j = 0; j <= cell.maxWidth+1; j++)
	             {
	    	       cell.grid[i][j] = 1;
	              }
		  }
		cell.deleteAllCell();
		assertEquals(0,cell.grid[1][4]);
	}
	@Test
	public void testupdate() {
		cell.grid[2][1]=1;
		cell.grid[2][3]=1;
		cell.grid[1][2]=1;
		cell.update();
		assertEquals(1,cell.grid[2][2]);
	}
}
