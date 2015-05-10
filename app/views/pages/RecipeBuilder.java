
struct compNum
	string name
	int num

item
int tier //t0-t4
string name
boolean isBase() //true if no components
 if self.getNumComps > 0, return true
	else return false;
compNum[] components //array of compNums, pairs of component names and counts
int getNumComps()
 return components.size //number of unique ingredients

t0 => '' //t0 mats have no components
T1 => {compNum} //one compNum struct for each ingredient, name and num
T2 => {compNum} //same for every tier

compNum[] getTotalComps()
Recipe recipe = new Recipe(this.getName());
foreach compNum in components
	recipe.add(compNum)
retrn

class Recipe
{
	string name;
	compNum[] components = {}
	void Recipe(string n)
	{
		try{
		if(itemMap.contains(n))
			name = n;
			components = this.add(n);
		else
			name = "%error%";
			throw ItemNotFoundException;
		}
		
				
	}
	compNum[] add(string matName)
	{
	


	
}




