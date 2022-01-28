<?php
// https://www.luogu.com.cn/problem/P5720
fscanf(STDIN, '%d', $n);
$i = 0;
while ($n > 1) {
  $n = (int)($n / 2);
  $i++;
}
echo $i + 1;
