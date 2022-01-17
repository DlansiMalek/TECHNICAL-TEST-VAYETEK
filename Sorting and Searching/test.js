function search(goal,array) {

    let size = array.length;
    let index;
    let result;
	/*we have to devide the array to two sorted arrays so for that we have to find the index of the first element of the origin array before applaying rotation*/
    for(var i=0;i<size-1;i++) {
        if(array[i]>array[i+1]) {
            index = i+1;
            break;
        }
    }

    let start;
    let end;
	/*here we will define the start and the end indexes (the subarray that have our goal)*/
    if(goal>=array[index]) {
        start = index;
        end = size;
    } else {
        start = 0;
        end = index-1;
    }
    /*we look for goal in a regular sorted array*/
    for(var i = start;i<end;i++) {
        if(array[i] == goal) {
            result = i;
            break;
        }
    }

    return result;

}
/*test the function*/
var array = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14]
console.log(search(5,array));
