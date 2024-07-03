public class Point {
     
	private int x, y;

	public Point( int x, int y ){
            this.x = x;
            this.y = y;
	}
        
        @Override
	public Point clone(){
	    return new Point(x, y);
        }
        
        public boolean equals(Point p) {
            return p != null && p.getX() == x && p.getY() == y;
        }
	
	public void setLocation(Point loc){
            x = loc.getX();
            y = loc.getY();
	}
	
	public int getX(){
            return x;
	}
	
	public int getY(){
            return y;
	}

}