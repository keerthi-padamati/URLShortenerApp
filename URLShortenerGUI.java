import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import java.util.*;

class URLShortnerGUI
{
   private Map<String, String> shortToUrl = new HashMap<>();
    private static final String CHAR_POOL = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int CODE_LENGTH = 6; // you replace the output url size heres
    private Random random = new Random();
  


