import { Shape } from "./shapes/shape.js";

class Renderer {
    private shape: Shape;

    constructor(shape: Shape) {
        this.shape = shape;
    }

    public draw(): void {
        const area: number = this.shape.getArea();
        console.log("Shape drawn\n" + "Its area is " + area);
    }
}

export { Renderer };
