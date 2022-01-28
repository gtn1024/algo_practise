<?php
// https://www.luogu.com.cn/problem/P5718
fscanf(STDIN, '%d', $n);
$ls = explode(' ', trim(fgets(STDIN)));
$min = 1010;
for ($i = 0; $i < $n; $i++) {
  $min = min($min, $ls[$i]);
}
echo $min;
