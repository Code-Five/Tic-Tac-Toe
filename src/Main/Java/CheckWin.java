package Main.Java;

public class CheckWin {
    public boolean checkWin(String[] box) {
        String box1 = box[0];
        String box2 = box[1];
        String box3 = box[2];
        boolean checkFlag = false;

        // Check horizontal winning combinations
        if ((box1.equals("1") || box2.equals("1") || box3.equals("1")) &&
                (box1.equals("2") || box2.equals("2") || box3.equals("2")) &&
                (box1.equals("3") || box2.equals("3") || box3.equals("3")) ) {
            checkFlag = true;
        }
        if ((box1.equals("4") || box2.equals("4") || box3.equals("4")) &&
                (box1.equals("5") || box2.equals("5") || box3.equals("5")) &&
                (box1.equals("6") || box2.equals("6") || box3.equals("6")) ) {
            checkFlag = true;
        }
        if ((box1.equals("7") || box2.equals("7") || box3.equals("7")) &&
                (box1.equals("8") || box2.equals("8") || box3.equals("8")) &&
                (box1.equals("9") || box2.equals("9") || box3.equals("9")) ) {
            checkFlag = true;
        }

        // Check vertical winning combinations
        if ((box1.equals("1") || box2.equals("1") || box3.equals("1")) &&
                (box1.equals("4") || box2.equals("4") || box3.equals("4")) &&
                (box1.equals("7") || box2.equals("7") || box3.equals("7")) ) {
            checkFlag = true;
        }
        if ((box1.equals("2") || box2.equals("2") || box3.equals("2")) &&
                (box1.equals("5") || box2.equals("5") || box3.equals("5")) &&
                (box1.equals("8") || box2.equals("8") || box3.equals("8")) ) {
            checkFlag = true;
        }
        if ((box1.equals("3") || box2.equals("3") || box3.equals("3")) &&
                (box1.equals("6") || box2.equals("6") || box3.equals("6")) &&
                (box1.equals("9") || box2.equals("9") || box3.equals("9")) ) {
            checkFlag = true;
        }

        // Check diagonal winning combinations
        if ((box1.equals("1") || box2.equals("1") || box3.equals("1")) &&
                (box1.equals("5") || box2.equals("5") || box3.equals("5")) &&
                (box1.equals("9") || box2.equals("9") || box3.equals("9")) ) {
            checkFlag = true;
        }
        if ((box1.equals("3") || box2.equals("3") || box3.equals("3")) &&
                (box1.equals("5") || box2.equals("5") || box3.equals("5")) &&
                (box1.equals("7") || box2.equals("7") || box3.equals("7")) ) {
            checkFlag = true;
        }

        return checkFlag;
    }
}
