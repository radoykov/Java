package bank;

import java.io.*;
import java.util.*;

/*
 Simple persistence utility for saving and loading collections of objects
 using Java's built‑in serialization mechanism and generics.
 These files can be read only with file streams, so they are secure.
 */
public class Database {

    public static <T> void save(String file, Collection<T> data) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(file))) {
            for (T obj : data) {
                oos.writeObject(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void load(String file, Collection<T> data) {
        File f = new File(file);
        if (!f.exists()) return;

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                data.add((T) ois.readObject());
            }
        } catch (EOFException ignored) {//Breaks the while
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
