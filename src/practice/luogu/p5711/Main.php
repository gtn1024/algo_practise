<?php
// https://www.luogu.com.cn/problem/P5711
function isLeap(int $y)
{
  return ($y % 4 == 0 && $y % 100 != 0) || $y % 400 == 0;
}

fscanf(STDIN, '%d', $y);
echo isLeap($y) ? 1 : 0;
