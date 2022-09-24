class Board {
	char[][] layout = new char[3][3];
	
	for(int i=0; i<3; i++) {
		for(int j=0; j<3; j++) {
			layout[i][j]='*';
		}
	}
	
	public boolean Move(int row, int column, char move) {
		if(row<0 || row>=3 || column<0 || column>=3 || this.layout[row][column]!='*') {
			System.out.println("Invalid Move!");
			return false;
		}
		
		layout[row][column] = move;
		
		return true;
	}
	
	public boolean Check() {
		for(int i=0; i<3; i++) {
			if(this.layout[i][0]==this.layout[i][1] && this.layout[i][0]==this.layout[i][1]) {
				return true;
			}
			
			if(this.layout[0][i]==this.layout[1][i] && this.layout[0][i]==this.layout[1][i]) {
				return true;
			}
		}
			
		if(this.layout[0][0]==this.layout[1][1] && this.layout[0][0]==this.layout[2][2]) {
			return true;
		}
			
		if(this.layout[0][2]==this.layout[1][1] && this.layout[1][1]==this.layout[2][0]) {
			return true;
		}
		
		return false;
	}
}
