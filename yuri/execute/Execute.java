package yuri.execute;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Execute
   {
   public void exec(String[] paths)
      {
      int i =0;
      
      try
         {
         for (i = 0; i < paths.length; i++)
            {
            ProcessBuilder process = new ProcessBuilder(paths[i]);
            process.start();
            }
         }

      catch (IOException e)
         {
         JOptionPane.showMessageDialog(null, "Error in programs.ini:\n" + (paths[i]) + "\n\nPossible causes:\n- Incorrect path\n- File isn't executable\n- Has been abducted by aliens\n- Magic", "Launch ALL the Programs!",
                  JOptionPane.ERROR_MESSAGE);
         e.printStackTrace();
         }
      }
   }
