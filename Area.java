package Annual_Internal2024boards;

class Area{
    //for parallelogram
    float ar(float base, float ht){ //float - base and height as parameters
        float area_p; //return type= float
        area_p = base*ht; //formula
        return(area_p); //returning the area
    }
    
    //for rhombus
    double ar(double d1, double d2){//double - diagonals as parameters
        double area_r; //return type = double
        area_r = 0.5 * d1 * d2; //formula
        return(area_r); //returning the area
    }
    
    //for trapezium 
    double ar(double a, double b, double h){ /** 3 double, parallel sides 
        and height as parameters */
        double area_t; //return type = double
        area_t = 0.5 * (a+b) * h; //formula
        return(area_t); //returning the area
    }
}