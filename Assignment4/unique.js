let arr = [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6];

for (let i = 0; i < arr.length; i += 2) {
    if (arr[i] !== arr[i + 1]) {
        console.log(`Unique element: ${arr[i]} at index: ${i}`);
        break;
    }
}
