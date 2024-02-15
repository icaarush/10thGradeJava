package Annual_Internal2024boards;

class volume_overload{
    /** I have used Math.PI and not 22/7 for the value of π because,
     22/7 is an approximation of π not the actual value of π */
    //for sphere
    double volume(double r){ //1 parameter
        double v; //return type - double
        v = 1.34 * Math.PI * r * r * r; //formula [1.333... ≈ 1.34]
        return(v); //returning the volume
    }
    
    //for cylinder
    double volume(double h, double r){ //2 parameters
        double v; //return type - double
        v = Math.PI * r * r * h; //formula
        return(v); //returning the volume
    }
    
    //for cuboid
    double volume(double l, double b, double h){ //3 parameters
        double v; //return type - double
        v = l * b * h; //formula
        return(v); //returning the volume
    }
}