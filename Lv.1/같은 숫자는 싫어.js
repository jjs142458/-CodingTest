function solution(arr) {
  var answer = [];
  let top = -1;

  for (num of arr) {
    if (num != top) {
      top = num;
      answer.push(num);
    }
  }

  return answer;
}

print(solution([1, 1, 3, 3, 0, 1, 1]));
