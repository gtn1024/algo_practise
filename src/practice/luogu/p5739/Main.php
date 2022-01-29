<?php
// https://www.luogu.com.cn/problem/P5739
function f(int $i)
{
  if ($i === 0) return 1;
  return $i * f($i - 1);
}

fscanf(STDIN, '%d', $n);
echo f($n);
