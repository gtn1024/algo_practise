<?php
// https://www.luogu.com.cn/problem/P1425
fscanf(STDIN, '%d%d%d%d', $a, $b, $c, $d);
$h = $c - $a - 1;
$m = (60 - $b) + $d;
if ($m >= 60) {
  $m -= 60;
  $h += 1;
}
echo $h . ' ' . $m;
