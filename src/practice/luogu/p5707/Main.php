<?php
// https://www.luogu.com.cn/problem/P5707
fscanf(STDIN, '%d%d', $s, $v);
$time = 10 + (int)ceil($s / $v);
$h = 7;
$m = 60;
$h -= (int)($time / 60);
$m -= $time % 60;
while ($h < 0) $h += 24;
if ($h < 10) echo 0;
echo $h . ':';
if ($m < 10) echo 0;
echo $m;
