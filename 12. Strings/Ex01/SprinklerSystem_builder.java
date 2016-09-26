class WaterSource {
  private String s;
  WaterSource() {
    System.out.println("WaterSource()");
    s = "Constructed";
  }
  public String toString() { return s; }
}	

public class SprinklerSystem_builder {
  private String valve1, valve2, valve3, valve4;
  private WaterSource source = new WaterSource();
  private int i;
  private float f;
  public String toString() {
	
	StringBuilder result = new StringBuilder();
	result.append("valve1 = "); result.append(valve1); result.append(" ");
	result.append("valve2 = "); result.append(valve2); result.append(" ");
	result.append("valve3 = "); result.append(valve3); result.append(" ");
	result.append("valve4 = "); result.append(valve4); result.append("\n");
	result.append("i = "); result.append(i); result.append(" ");
	result.append("f = "); result.append(f); result.append(" ");
	result.append("source = "); result.append(source);
	
    return result.toString();
  }	
  public static void main(String[] args) {
    SprinklerSystem_builder sprinklers = new SprinklerSystem_builder();
    System.out.println(sprinklers);
  }
}
