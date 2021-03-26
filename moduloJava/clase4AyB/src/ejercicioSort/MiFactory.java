package ejercicioSort;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {
    public static Object getInstance(String objName) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException {
        Properties prop = new Properties();

        prop.load(new FileInputStream(new File("MiFactory.properties")));

        String className = (String)prop.get(objName);

        return Class.forName(className).newInstance();
    }
}
