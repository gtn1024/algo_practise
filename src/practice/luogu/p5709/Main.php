<?php
// https://www.luogu.com.cn/problem/P5709
fscanf(STDIN, '%d%d%d', $m, $t, $s);
if ($t === 0) {
  echo 0;
  return;
}
$m = $m - (int)ceil($s / $t);
echo $m < 0 ? 0 : $m;
