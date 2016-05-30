package aquarium;
public class Water {
	boolean salty = false;
}

package aquarium.jellies;
public class Water {
	boolean salty = true;
}

package employee;
import aquarium.*;
import aquarium.jellies.Water;

public class WaterFiller {
	Water water;
}