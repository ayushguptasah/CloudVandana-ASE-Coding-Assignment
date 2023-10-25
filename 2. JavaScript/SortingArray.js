const arr1 = [10, 40, 30, 12, 50]; 

function arrSort(arr) { 
	arr.sort((a,b)=>a-b); 
	arr.reverse(); 
	return arr; 
} 

console.log(arrSort(arr1)); 
