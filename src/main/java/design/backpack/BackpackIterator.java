package backpack;

import tool.MiningTool;
import java.util.HashMap;

public interface BackpackIterator {
     boolean hasNext();
     MiningTool next();
     HashMap<String, Integer> aggregation();
}
