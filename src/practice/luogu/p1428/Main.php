<?php
// https://www.luogu.com.cn/problem/P1428
fscanf(STDIN, '%d', $n);
$ls = explode(' ', trim(fgets(STDIN)));
for ($i = 0; $i < $n; $i++) {
  $cnt = 0;
  for ($j = 0; $j < $i; $j++) {
    if ($ls[$i] > $ls[$j]) $cnt++;
  }
  echo $cnt . ' ';
}
