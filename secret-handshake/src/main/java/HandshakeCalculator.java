/*
    TODO: Still in progress...
 */


import java.util.ArrayList;
import java.util.List;

class HandshakeCalculator {

    private List<Signal> signals = new ArrayList<>();

    List<Signal> calculateHandshake(int number) {
        String binaryString =  Integer.toBinaryString(number);
        determineSignal(binaryString);


        return signals;
    }

    private void determineSignal(String binaryString) {
        switch (binaryString) {
            case "1":
                signals.add(Signal.WINK);
                break;
            case "10":
                signals.add(Signal.DOUBLE_BLINK);
                break;
            case "100":
                signals.add(Signal.CLOSE_YOUR_EYES);
                break;
            case "1000":
                signals.add(Signal.JUMP);
                break;
            case "10000":
                break;
            case "100000":
                break;
            default:
                calculate(binaryString);
                break;
        }
    }

    private void calculate(String binaryString) {
        int accumulator = 0;

        List<Integer> codes = new ArrayList<>();
        codes.add(1000);
        codes.add(100);
        codes.add(10);
        codes.add(1);

        for (Integer code : codes) {
            if(accumulator != Integer.parseInt(binaryString)){
                accumulator = accumulator + code;
                determineSignal(code.toString());
            }
        }
    }
}
