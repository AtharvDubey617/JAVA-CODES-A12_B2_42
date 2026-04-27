class Signal {
    double magnitude, phase;
    
    Signal(double m, double p) {
        magnitude = m;
        phase = p;
    }

    Signal add(double magnitude, double phase) {
        double addMagnitude = this.magnitude + magnitude;
        double addPhase = this.phase + phase;
        return new Signal(addMagnitude, addPhase);
    }

    Signal Scale(double factor) {
        double newMagnitude = this.magnitude * factor;
        return new Signal(newMagnitude, phase);
    }

    void display() {
        System.out.println("Magnitude: " + magnitude);
        System.out.println("Phase: " + phase);
        System.out.println("");
    }

    public static void main(String[] args) {
        Signal s1 = new Signal(5.0, 30.0);
        Signal s2 = new Signal(3.0, 20.0);
        System.out.println("Signal 1:");
        s1.display();
        System.out.println("Signal 2:");
        s2.display();
        Signal sum = s1.add(s2.magnitude, s2.phase);
        sum.display();
        // System.out.println("Sum of magnitude: " + (s1.magnitude + s2.magnitude));
        // System.out.println("Sum of phase: " + (s1.phase + s2.phase));
        double factor = 2.0;
        Signal scaledSignal = s1.Scale(factor);
        System.out.println("Factor: ");
        scaledSignal.display();
    }
}