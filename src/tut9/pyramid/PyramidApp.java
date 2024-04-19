package tut9.pyramid;

public class PyramidApp {
    public static void main(String[] args) {
        Pyramid p1 = new Pyramid();
        p1.halfRightPyramid(10);
        p1.halfLeftPyramid(7);
        p1.fullPyramid(10);
        p1.invertedHalfRightPyramid(7);
        p1.invertedHalfLeftPyramid(7);
        p1.invertedFullPyramid(7);
        p1.pascalPyramid(8);
        p1.floydPyramid(7);
        p1.pyramidMultipleOfTwo(6);
    }
}
