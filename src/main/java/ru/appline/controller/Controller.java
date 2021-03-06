package ru.appline.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Compass;
import ru.appline.logic.Model;

public class Controller {
    private static final Model model = Model.getInstance();

    @PostMapping(value = "/createCompass", consumes = "application/json")
    public void createCompass(@RequestBody String side, Compass compass) {
        model.add(compass, side);
    }

    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> degree(@RequestParam(value="Degree") Integer Degree) {

        //добавим дополнительную переменную поиска полученного значения Degree
        boolean found = false;
        int searchedValue = Degree;

        //стороны света по градусам
        Compass side1 = model.get("North");
        int[] array1 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,337,338,339,340,341,342,343,344,
        345,346,347,348,349,350,351,352,353,354,355,356,357,358,359,360};

        Compass side2 = model.get("NorthEast");
        int[] array2 = {22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
        51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66};

        Compass side3 = model.get("East");
        int[] array3 = {67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,
        96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111};

        Compass side4 = model.get("SouthEast");
        int[] array4 = {112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,129,130,131,132,
        133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156};

        Compass side5 = model.get("South");
        int[] array5 = {157,158,159,160,161,162,163,164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,
        180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,199,200,201};

        Compass side6 = model.get("SouthWest");
        int[] array6 = {202,203,204,205,206,207,208,209,210,211,212,213,214,215,216,217,218,219,220,221,222,223,224,
        225,226,227,228,229,230,231,232,233,234,235,236,237,238,239,240,241,242,243,244,245,246};

        Compass side7 = model.get("West");
        int[] array7 = {247,248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268,269,
        270,271,272,273,274,275,276,277,278,279,280,281,282,283,284,285,286,287,288,289,290,291};

        Compass side8 = model.get("NorthWest");
        int[] array8 = {292,293,294,295,296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311,312,313,314,
        315,316,317,318,319,320,321,322,323,324,325,326,327,328,329,330,331,332,333,334,335,336};

        //проверка какому из диапазонов принадлежит Degree, вывод соответствующей стороны света
        for(int x : array1) {
        if (x == searchedValue) {
            found = true;
            return new ResponseEntity<String>("{\"Side\":North}", HttpStatus.OK);
            }
        }

        for(int x : array2) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":NorthEast}", HttpStatus.OK);
            }
        }

        for(int x : array3) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":East}", HttpStatus.OK);
            }
        }

        for(int x : array4) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":SouthEast}", HttpStatus.OK);
            }
        }

        for(int x : array5) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":South}", HttpStatus.OK);
            }
        }

        for(int x : array6) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":SouthWest}", HttpStatus.OK);
            }
        }

        for(int x : array7) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":West}", HttpStatus.OK);
            }
        }

        for(int x : array8) {
            if (x == searchedValue) {
                found = true;
                return new ResponseEntity<String>("{\"Side\":NorthWest}", HttpStatus.OK);
            }
        }

        return new ResponseEntity<String>("{\"text\":Failed}", HttpStatus.OK);
    }
}
