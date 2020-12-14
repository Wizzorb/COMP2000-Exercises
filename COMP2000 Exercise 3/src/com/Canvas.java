package com;


public class Canvas {
    int canvasNum = 0;

    public void draw() {
//begin of modifiable zone(JavaCode)......C/354e5bf9-555f-49c6-ba1a-702fca94d6bd
        canvasNum = canvasNum + 1;
//end of modifiable zone(JavaCode)........E/354e5bf9-555f-49c6-ba1a-702fca94d6bd
    }

    public void delete() {
//begin of modifiable zone(JavaCode)......C/9c8755e6-45e9-46fc-bafa-3acb3ec5de1d
        canvasNum = canvasNum - 1;
//end of modifiable zone(JavaCode)........E/9c8755e6-45e9-46fc-bafa-3acb3ec5de1d
    }

}
