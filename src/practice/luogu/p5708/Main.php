<?php
// https://www.luogu.com.cn/problem/P5708
fscanf(STDIN, '%f%f%f', $a, $b, $c);
$p = ($a + $b + $c) / 2;
echo sprintf('%.1f', sqrt($p * ($p - $a) * ($p - $b) * ($p - $c)));
