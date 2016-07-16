/**
* Show that protected methods have package access but are not public.
*/

import java.util.*;
import my.lib.prt.*;

public class Ex04_PackageAccess {
	
	public static void main(String[] args) {
		Class2.f();
	}
}