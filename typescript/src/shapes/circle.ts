import { Shape } from "./shape";

class Circle implements Shape {
    private radius: number

    constructor(radius: number) {
        this.radius = radius;
    }

    public getArea(): number {
        return Math.PI * this.radius ** 2;
    }
}

export { Circle };

