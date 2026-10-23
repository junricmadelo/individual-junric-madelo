package com.joysistvi.day8.switchstatement;

public class SwitchStatement {

    public static void main(String[] args) {
        String sizeCode = "M";
        String sizeDescription = "";

        switch (sizeCode) {
            case "XS":
                sizeDescription = "Extra Small";
                break;
            case "S":
                sizeDescription = "Small";
                break;
            case "M":
                sizeDescription = "Medium";
                break;
            case "L":
                sizeDescription = "Large";
                break;
            case "XL":
                sizeDescription = "Extra Large";
                break;
            default:
                sizeDescription = "Invalid Size Code! Please enter XS, S, M, L, XL";
                break;
        }

        System.out.println(sizeDescription);
    }
}























        /*
    int day = 3;
    String dayName = "";

        A switch statement evaluates an express (in this case. the variably day and matches its value against define ' case' labels



        switch (day) {
        case 1:
            dayName = "Monday" ;
            break;
        case 2:
            dayName = "Tuesday" ;
            break;
        case 3:
            dayName = "Wednesday" ;
            break;
        case 4:
            dayName = "Thursday" ;
            break;
        case 5:
            dayName = "Friday" ;
            break;
        case 6:
            dayName = "Saturday" ;
            break;
        case 7:
            dayName = "Sunday" ;
            break;
        default:
            dayName = "Invalid Day" ;
    }
        System.out.println("Today is: " + dayName);
}
}
*/