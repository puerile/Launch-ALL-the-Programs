package yuri.read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class ReadPaths
   {
   private String userdir;
   private String separator;

   public ReadPaths()
      {
      this.userdir = System.getProperty("user.dir");
      this.separator = System.getProperty("file.separator");
      }

   public String[] read()
      {
      try
         {
         LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream(userdir + separator
                  + "programs.ini")));

         List<String> paths = new LinkedList<String>();
         String lastLine;

         while ((lastLine = reader.readLine()) != null)
            {
            if (!(lastLine.startsWith("#")) && !(lastLine.isEmpty()))
               {
               paths.add(lastLine);
               }
            }

         return (String[]) paths.toArray(new String[0]);
         }

      catch (IOException e)
         {
         JOptionPane.showMessageDialog(null, "Error: programs.ini not found :(\n\nExpected location:\n" + userdir, "Launch ALL the Programs!",
                  JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
         }

      return new String[0];
      }
   }
