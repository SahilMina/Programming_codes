class Box3 {
    double width;
    double height;
    double depth;

    Box3(box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box3(double len) {
        width = height = depth = len;
    }

    Box3() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return (width * height * depth);
    }
}

class BoxWeight extends Box3 {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class Q67 {
    public static void main(String args[]) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box3 plainbox = new Box3();
        double vol;
        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is" + weightbox.weight);
        System.out.println();
        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Volume of plainbox is " + vol);
    }
}