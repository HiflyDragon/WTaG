import java.io.*;

public class KGATO {
	public static void main(String args[]) {
		String usrHome = System.getProperty("user.home");
		try {
			File file = new File(usrHome + "\\AppData\\Local\\TslGame\\Saved\\Config\\WindowsNoEditor\\Engine.ini");
			FileWriter fw =  new FileWriter(file,false);
			fw.write("[Core.System]\r\n");
			fw.write("Paths=../../../Engine/Content\r\n");
			fw.write("Paths=%GAMEDIR%Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/OceanPlugin/Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/Mutable/Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/Runtime/Coherent/CoherentUIGTPlugin/Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/RoadEditor/Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/2D/Paper2D/Content\r\n");
			fw.write("Paths=../../../Engine/Plugins/Wwise/Content\r\n");
			fw.write("\r\n");
			fw.write("[/script/engine.renderersettings]\r\n");
			fw.write("foliage.DiscardDataOnLoad=1\r\n");
			fw.write("grass.DiscardDataOnLoad=1\r\n");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}