
public interface CanRun {}
public class Cheetah extends CanRun {} // DOES NOT COMPILE
public class Hyena {}
public interface HasFur extends Hyena {} // DOES NOT COMPILE