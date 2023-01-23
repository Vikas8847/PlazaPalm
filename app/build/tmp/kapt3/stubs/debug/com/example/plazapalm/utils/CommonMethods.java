package com.example.plazapalm.utils;

import java.lang.System;

@android.annotation.SuppressLint(value = {"StaticFieldLeak"})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000{\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u00ac\u0001\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u00e8\u0002\u001a\u00030\u0095\u0001J&\u0010\u00e8\u0002\u001a\u00020\u00102\u0007\u0010\u00e9\u0002\u001a\u00020I2\u000e\u0010\u00ea\u0002\u001a\t\u0012\u0004\u0012\u00020\u00040\u00eb\u0002\u00a2\u0006\u0003\u0010\u00ec\u0002J\u001d\u0010\u00ed\u0002\u001a\u0004\u0018\u00010\u00042\u0007\u0010\u00ee\u0002\u001a\u00020\u00042\u0007\u0010\u00ef\u0002\u001a\u00020\u0004H\u0002J\b\u0010\u00f0\u0002\u001a\u00030\u0095\u0001J\u001b\u0010\u00f1\u0002\u001a\u00030\u00f2\u00022\b\u0010\u00f3\u0002\u001a\u00030\u00f4\u00022\u0007\u0010\u00f5\u0002\u001a\u00020\u0004J\n\u0010\u00f6\u0002\u001a\u00030\u00f2\u0002H\u0007J\b\u0010\u00f7\u0002\u001a\u00030\u00f2\u0002J\u0014\u0010\u00f8\u0002\u001a\u0005\u0018\u00010\u00f9\u00022\b\u0010\u00fa\u0002\u001a\u00030\u00f9\u0002J\b\u0010\u00fb\u0002\u001a\u00030\u00f2\u0002J\u001a\u0010\u00fc\u0002\u001a\u00030\u00f2\u00022\u0007\u0010H\u001a\u00030\u00fd\u00022\u0007\u0010\u00ee\u0002\u001a\u00020\u0004J\u001c\u0010\u00fe\u0002\u001a\u00030\u00f2\u00022\f\b\u0002\u0010\u00ff\u0002\u001a\u0005\u0018\u00010\u0095\u0001\u00a2\u0006\u0003\u0010\u0080\u0003R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001a\u00106\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020IX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020[X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR(\u0010c\u001a\u0010\u0012\f\u0012\n e*\u0004\u0018\u00010\u00040\u00040dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u001c\u0010j\u001a\u0004\u0018\u00010kX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u001a\u0010p\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u0006\"\u0004\br\u0010\bR\u001a\u0010s\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0006\"\u0004\bu\u0010\bR\u001a\u0010v\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0006\"\u0004\bx\u0010\bR\u001a\u0010y\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010\u0006\"\u0004\b{\u0010\bR\u001a\u0010|\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b}\u0010\u0006\"\u0004\b~\u0010\bR\u001c\u0010\u007f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0006\"\u0005\b\u0081\u0001\u0010\bR\u001d\u0010\u0082\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010\u0006\"\u0005\b\u0084\u0001\u0010\bR\u001d\u0010\u0085\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0006\"\u0005\b\u0087\u0001\u0010\bR\u001d\u0010\u0088\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0006\"\u0005\b\u008a\u0001\u0010\bR\u001d\u0010\u008b\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008c\u0001\u0010\u0006\"\u0005\b\u008d\u0001\u0010\bR\u001d\u0010\u008e\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010\u0006\"\u0005\b\u0090\u0001\u0010\bR\u001d\u0010\u0091\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0092\u0001\u0010\u0006\"\u0005\b\u0093\u0001\u0010\bR \u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001d\u0010\u0099\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0006\"\u0005\b\u00a1\u0001\u0010\bR\u001d\u0010\u00a2\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0001\u0010\u0006\"\u0005\b\u00a4\u0001\u0010\bR\u001d\u0010\u00a5\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0001\u0010\u0006\"\u0005\b\u00a7\u0001\u0010\bR\u001d\u0010\u00a8\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0001\u0010\u0006\"\u0005\b\u00aa\u0001\u0010\bR\u001d\u0010\u00ab\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0001\u0010\u0006\"\u0005\b\u00ad\u0001\u0010\bR\u001d\u0010\u00ae\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0001\u0010\u0006\"\u0005\b\u00b0\u0001\u0010\bR\u001d\u0010\u00b1\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0001\u0010\u0006\"\u0005\b\u00b3\u0001\u0010\bR\u001d\u0010\u00b4\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u0006\"\u0005\b\u00b6\u0001\u0010\bR \u0010\u00b7\u0001\u001a\u00030\u00b8\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b9\u0001\u0010\u00ba\u0001\"\u0006\b\u00bb\u0001\u0010\u00bc\u0001R\u0010\u0010\u00bd\u0001\u001a\u00030\u00be\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00bf\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c0\u0001\u0010\u0006\"\u0005\b\u00c1\u0001\u0010\bR\u001d\u0010\u00c2\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c3\u0001\u0010\u0006\"\u0005\b\u00c4\u0001\u0010\bR\u001d\u0010\u00c5\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c6\u0001\u0010\u0006\"\u0005\b\u00c7\u0001\u0010\bR\u001d\u0010\u00c8\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c9\u0001\u0010\u0006\"\u0005\b\u00ca\u0001\u0010\bR\u001d\u0010\u00cb\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cc\u0001\u0010\u0006\"\u0005\b\u00cd\u0001\u0010\bR\u001d\u0010\u00ce\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cf\u0001\u0010\u0006\"\u0005\b\u00d0\u0001\u0010\bR\u001d\u0010\u00d1\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d2\u0001\u0010\u0006\"\u0005\b\u00d3\u0001\u0010\bR\u001d\u0010\u00d4\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d5\u0001\u0010\u0006\"\u0005\b\u00d6\u0001\u0010\bR\u001d\u0010\u00d7\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d8\u0001\u0010\u0006\"\u0005\b\u00d9\u0001\u0010\bR\u001d\u0010\u00da\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00db\u0001\u0010\u0006\"\u0005\b\u00dc\u0001\u0010\bR\u001d\u0010\u00dd\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00de\u0001\u0010\u0006\"\u0005\b\u00df\u0001\u0010\bR\u001d\u0010\u00e0\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e1\u0001\u0010\u0006\"\u0005\b\u00e2\u0001\u0010\bR\u001d\u0010\u00e3\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e4\u0001\u0010\u0006\"\u0005\b\u00e5\u0001\u0010\bR\u001d\u0010\u00e6\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00e7\u0001\u0010\u0006\"\u0005\b\u00e8\u0001\u0010\bR\u001d\u0010\u00e9\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ea\u0001\u0010\u0006\"\u0005\b\u00eb\u0001\u0010\bR\u001d\u0010\u00ec\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ed\u0001\u0010\u0006\"\u0005\b\u00ee\u0001\u0010\bR\u001d\u0010\u00ef\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f0\u0001\u0010\u0006\"\u0005\b\u00f1\u0001\u0010\bR\u001d\u0010\u00f2\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f3\u0001\u0010\u0006\"\u0005\b\u00f4\u0001\u0010\bR\u001d\u0010\u00f5\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f6\u0001\u0010\u0006\"\u0005\b\u00f7\u0001\u0010\bR\u001d\u0010\u00f8\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00f9\u0001\u0010\u0006\"\u0005\b\u00fa\u0001\u0010\bR\u001d\u0010\u00fb\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fc\u0001\u0010\u0006\"\u0005\b\u00fd\u0001\u0010\bR\u001d\u0010\u00fe\u0001\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ff\u0001\u0010\u0012\"\u0005\b\u0080\u0002\u0010\u0014R\u001d\u0010\u0081\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0002\u0010\u0006\"\u0005\b\u0083\u0002\u0010\bR\u001d\u0010\u0084\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0002\u0010\u0006\"\u0005\b\u0086\u0002\u0010\bR\u001d\u0010\u0087\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0002\u0010\u0006\"\u0005\b\u0089\u0002\u0010\bR\u001d\u0010\u008a\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0002\u0010\u0006\"\u0005\b\u008c\u0002\u0010\bR\u001d\u0010\u008d\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0002\u0010\u0006\"\u0005\b\u008f\u0002\u0010\bR\u001d\u0010\u0090\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0002\u0010\u0006\"\u0005\b\u0092\u0002\u0010\bR\u001d\u0010\u0093\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0002\u0010\u0006\"\u0005\b\u0095\u0002\u0010\bR\u001d\u0010\u0096\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0002\u0010\u0006\"\u0005\b\u0098\u0002\u0010\bR\u001d\u0010\u0099\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0002\u0010\u0006\"\u0005\b\u009b\u0002\u0010\bR\u001d\u0010\u009c\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0002\u0010\u0006\"\u0005\b\u009e\u0002\u0010\bR\u001d\u0010\u009f\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0002\u0010\u0006\"\u0005\b\u00a1\u0002\u0010\bR\u001d\u0010\u00a2\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a3\u0002\u0010\u0006\"\u0005\b\u00a4\u0002\u0010\bR\u001d\u0010\u00a5\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a6\u0002\u0010\u0006\"\u0005\b\u00a7\u0002\u0010\bR\u001d\u0010\u00a8\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a9\u0002\u0010\u0006\"\u0005\b\u00aa\u0002\u0010\bR\u001d\u0010\u00ab\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ac\u0002\u0010\u0006\"\u0005\b\u00ad\u0002\u0010\bR\u001d\u0010\u00ae\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00af\u0002\u0010\u0006\"\u0005\b\u00b0\u0002\u0010\bR\u001d\u0010\u00b1\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b2\u0002\u0010\u0006\"\u0005\b\u00b3\u0002\u0010\bR\u001d\u0010\u00b4\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b5\u0002\u0010\u0006\"\u0005\b\u00b6\u0002\u0010\bR\u001d\u0010\u00b7\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00b8\u0002\u0010\u0006\"\u0005\b\u00b9\u0002\u0010\bR\u001d\u0010\u00ba\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00bb\u0002\u0010\u0006\"\u0005\b\u00bc\u0002\u0010\bR\u001d\u0010\u00bd\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00be\u0002\u0010\u0006\"\u0005\b\u00bf\u0002\u0010\bR\u001d\u0010\u00c0\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c1\u0002\u0010\u0006\"\u0005\b\u00c2\u0002\u0010\bR\u001d\u0010\u00c3\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c4\u0002\u0010\u0006\"\u0005\b\u00c5\u0002\u0010\bR\u001d\u0010\u00c6\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00c7\u0002\u0010\u0006\"\u0005\b\u00c8\u0002\u0010\bR\u001d\u0010\u00c9\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00ca\u0002\u0010\u0006\"\u0005\b\u00cb\u0002\u0010\bR\u001d\u0010\u00cc\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00cd\u0002\u0010\u0006\"\u0005\b\u00ce\u0002\u0010\bR\u001d\u0010\u00cf\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d0\u0002\u0010\u0006\"\u0005\b\u00d1\u0002\u0010\bR\u001d\u0010\u00d2\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d3\u0002\u0010\u0006\"\u0005\b\u00d4\u0002\u0010\bR\u001d\u0010\u00d5\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d6\u0002\u0010\u0006\"\u0005\b\u00d7\u0002\u0010\bR\u001d\u0010\u00d8\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00d9\u0002\u0010\u0006\"\u0005\b\u00da\u0002\u0010\bR\u001d\u0010\u00db\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00dc\u0002\u0010\u0006\"\u0005\b\u00dd\u0002\u0010\bR\u001d\u0010\u00de\u0002\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00df\u0002\u0010\u0006\"\u0005\b\u00e0\u0002\u0010\bR\u000f\u0010\u00e1\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e2\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e3\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e4\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e5\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e6\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e7\u0002\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0081\u0003"}, d2 = {"Lcom/example/plazapalm/utils/CommonMethods;", "", "()V", "BebasRegular", "", "getBebasRegular", "()Ljava/lang/String;", "setBebasRegular", "(Ljava/lang/String;)V", "abrilFatFaceRegular", "getAbrilFatFaceRegular", "setAbrilFatFaceRegular", "academyEngravedLetPlain", "getAcademyEngravedLetPlain", "setAcademyEngravedLetPlain", "advanceMap_Permission_ID", "", "getAdvanceMap_Permission_ID", "()I", "setAdvanceMap_Permission_ID", "(I)V", "alexBrushRegular", "getAlexBrushRegular", "setAlexBrushRegular", "allerBD", "getAllerBD", "setAllerBD", "allerBDLT", "getAllerBDLT", "setAllerBDLT", "allerDisplay", "getAllerDisplay", "setAllerDisplay", "allerIt", "getAllerIt", "setAllerIt", "allerItIt", "getAllerItIt", "setAllerItIt", "allerRG", "getAllerRG", "setAllerRG", "amaticBold", "getAmaticBold", "setAmaticBold", "amaticSCRegular", "getAmaticSCRegular", "setAmaticSCRegular", "antonioBold", "getAntonioBold", "setAntonioBold", "antonioLight", "getAntonioLight", "setAntonioLight", "antonioRegular", "getAntonioRegular", "setAntonioRegular", "blackJack", "getBlackJack", "setBlackJack", "caviarDreams", "getCaviarDreams", "setCaviarDreams", "caviarDreamsItalic", "getCaviarDreamsItalic", "setCaviarDreamsItalic", "chunkFivePrint", "getChunkFivePrint", "setChunkFivePrint", "chunkFiveRegular", "getChunkFiveRegular", "setChunkFiveRegular", "context", "Landroid/app/Activity;", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "cooperHewittBold", "getCooperHewittBold", "setCooperHewittBold", "cooperHewittBoldItalic", "getCooperHewittBoldItalic", "setCooperHewittBoldItalic", "cooperHewittBook", "getCooperHewittBook", "setCooperHewittBook", "cooperHewittHeavy", "getCooperHewittHeavy", "setCooperHewittHeavy", "currentLocation", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocation", "()Lcom/google/android/gms/maps/model/LatLng;", "setCurrentLocation", "(Lcom/google/android/gms/maps/model/LatLng;)V", "dancingScriptRegular", "getDancingScriptRegular", "setDancingScriptRegular", "deviceToken", "Landroidx/databinding/ObservableField;", "kotlin.jvm.PlatformType", "getDeviceToken", "()Landroidx/databinding/ObservableField;", "setDeviceToken", "(Landroidx/databinding/ObservableField;)V", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "email", "getEmail", "setEmail", "fTusj", "getFTusj", "setFTusj", "firaSansBold", "getFiraSansBold", "setFiraSansBold", "firaSansBoldItalic", "getFiraSansBoldItalic", "setFiraSansBoldItalic", "firaSansBook", "getFiraSansBook", "setFiraSansBook", "firaSansEight", "getFiraSansEight", "setFiraSansEight", "greatVibesRegular", "getGreatVibesRegular", "setGreatVibesRegular", "helloValentina", "getHelloValentina", "setHelloValentina", "interBlack", "getInterBlack", "setInterBlack", "interBold", "getInterBold", "setInterBold", "interBoldItalic", "getInterBoldItalic", "setInterBoldItalic", "interExtraBold", "getInterExtraBold", "setInterExtraBold", "isAdvanceMap", "", "()Z", "setAdvanceMap", "(Z)V", "josefiThin", "getJosefiThin", "setJosefiThin", "josefinBold", "getJosefinBold", "setJosefinBold", "josefinBoldItalic", "getJosefinBoldItalic", "setJosefinBoldItalic", "josefinLight", "getJosefinLight", "setJosefinLight", "josefinRegular", "getJosefinRegular", "setJosefinRegular", "latoBlack", "getLatoBlack", "setLatoBlack", "latoBlackItalic", "getLatoBlackItalic", "setLatoBlackItalic", "latoBold", "getLatoBold", "setLatoBold", "latoBoldItalic", "getLatoBoldItalic", "setLatoBoldItalic", "latoHairLIneItalic", "getLatoHairLIneItalic", "setLatoHairLIneItalic", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "montSerratAlternatesBlack", "getMontSerratAlternatesBlack", "setMontSerratAlternatesBlack", "montSerratAlternatesBlackItalic", "getMontSerratAlternatesBlackItalic", "setMontSerratAlternatesBlackItalic", "montSerratAlternatesBold", "getMontSerratAlternatesBold", "setMontSerratAlternatesBold", "openSansBold", "getOpenSansBold", "setOpenSansBold", "openSansBoldItalic", "getOpenSansBoldItalic", "setOpenSansBoldItalic", "openSansExtraBoldItalic", "getOpenSansExtraBoldItalic", "setOpenSansExtraBoldItalic", "openSansItalic", "getOpenSansItalic", "setOpenSansItalic", "openSansLight", "getOpenSansLight", "setOpenSansLight", "openSansRegular", "getOpenSansRegular", "setOpenSansRegular", "openSansSemiBold", "getOpenSansSemiBold", "setOpenSansSemiBold", "openSansSemiBoldItalic", "getOpenSansSemiBoldItalic", "setOpenSansSemiBoldItalic", "osWaldBold", "getOsWaldBold", "setOsWaldBold", "osWaldBoldItalic", "getOsWaldBoldItalic", "setOsWaldBoldItalic", "osWaldSemiBoldItalic", "getOsWaldSemiBoldItalic", "setOsWaldSemiBoldItalic", "ostrichRegular", "getOstrichRegular", "setOstrichRegular", "ostrichSansBlack", "getOstrichSansBlack", "setOstrichSansBlack", "ostrichSansBold", "getOstrichSansBold", "setOstrichSansBold", "ostrichSansHeavy", "getOstrichSansHeavy", "setOstrichSansHeavy", "ostrichSansLight", "getOstrichSansLight", "setOstrichSansLight", "ostrichSansMedium", "getOstrichSansMedium", "setOstrichSansMedium", "ostrichSansRoundedMedium", "getOstrichSansRoundedMedium", "setOstrichSansRoundedMedium", "pERMISSION_ID", "getPERMISSION_ID", "setPERMISSION_ID", "playfairDisplayBlack", "getPlayfairDisplayBlack", "setPlayfairDisplayBlack", "playfairDisplayBlackItalic", "getPlayfairDisplayBlackItalic", "setPlayfairDisplayBlackItalic", "playfairDisplayBold", "getPlayfairDisplayBold", "setPlayfairDisplayBold", "poppinBlack", "getPoppinBlack", "setPoppinBlack", "poppinBlackItalic", "getPoppinBlackItalic", "setPoppinBlackItalic", "poppinBold", "getPoppinBold", "setPoppinBold", "poppinBoldItalic", "getPoppinBoldItalic", "setPoppinBoldItalic", "poppinExtraBold", "getPoppinExtraBold", "setPoppinExtraBold", "ptc55", "getPtc55", "setPtc55", "ptc75F", "getPtc75F", "setPtc75F", "quicksAndBold", "getQuicksAndBold", "setQuicksAndBold", "quicksAndBoldItalic", "getQuicksAndBoldItalic", "setQuicksAndBoldItalic", "quicksAndItalic", "getQuicksAndItalic", "setQuicksAndItalic", "quicksAndLight", "getQuicksAndLight", "setQuicksAndLight", "quicksDash", "getQuicksDash", "setQuicksDash", "raleWayBlack", "getRaleWayBlack", "setRaleWayBlack", "raleWayBlackItalic", "getRaleWayBlackItalic", "setRaleWayBlackItalic", "raleWayBold", "getRaleWayBold", "setRaleWayBold", "raleWayBoldItalic", "getRaleWayBoldItalic", "setRaleWayBoldItalic", "raleWayItalic", "getRaleWayItalic", "setRaleWayItalic", "raleWayMedium", "getRaleWayMedium", "setRaleWayMedium", "seasRn", "getSeasRn", "setSeasRn", "sofiaRegular", "getSofiaRegular", "setSofiaRegular", "sourceSansProBlack", "getSourceSansProBlack", "setSourceSansProBlack", "sourceSansProBlackIt", "getSourceSansProBlackIt", "setSourceSansProBlackIt", "sourceSansProBold", "getSourceSansProBold", "setSourceSansProBold", "sourceSansProExtraLight", "getSourceSansProExtraLight", "setSourceSansProExtraLight", "titiliumBold", "getTitiliumBold", "setTitiliumBold", "titiliumLight", "getTitiliumLight", "setTitiliumLight", "titiliumRegular", "getTitiliumRegular", "setTitiliumRegular", "titiliumRegularItalic", "getTitiliumRegularItalic", "setTitiliumRegularItalic", "titiliumSemiBold", "getTitiliumSemiBold", "setTitiliumSemiBold", "walkwayBlack", "walkwayBold", "walkwayOblique", "walkwayObliqueBlack", "walkwayObliqueBold", "walkwayObliqueSemiBold", "windSong", "checkPermissions", "activity", "permission", "", "(Landroid/app/Activity;[Ljava/lang/String;)I", "getColoredSpanned", "text", "color", "isLocationEnabled", "persistImage", "", "bitmap", "Landroid/graphics/Bitmap;", "name", "requestNewLocationData", "requestPermissions", "saveBitmapToFile", "Ljava/io/File;", "file", "showSwipeDeleteAccountDialog", "showToast", "Landroid/content/Context;", "statusBar", "isWhite", "(Ljava/lang/Boolean;)V", "app_debug"})
public final class CommonMethods {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.plazapalm.utils.CommonMethods INSTANCE = null;
    private static int pERMISSION_ID = 42;
    
    /**
     * *This id is use for AdvanceMap Fragment
     */
    private static int advanceMap_Permission_ID = 45;
    private static boolean isAdvanceMap = false;
    @org.jetbrains.annotations.NotNull()
    private static android.app.Activity context;
    
    /**
     * *Delete Alert For Swipe to Delete class ...
     */
    @org.jetbrains.annotations.Nullable()
    private static android.app.Dialog dialog;
    public static com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    public static com.google.android.gms.maps.model.LatLng currentLocation;
    private static final com.google.android.gms.location.LocationCallback mLocationCallback = null;
    @org.jetbrains.annotations.NotNull()
    private static androidx.databinding.ObservableField<java.lang.String> deviceToken;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String email;
    
    /**
     * *Fonts A to z
     */
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String abrilFatFaceRegular = "fonts/abril_fatface_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String academyEngravedLetPlain = "fonts/academy_engraved_letplain.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String alexBrushRegular = "fonts/alex_brush_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerBD = "fonts/aller_bd.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerBDLT = "fonts/aller_bdIt.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerDisplay = "fonts/aller_display.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerIt = "fonts/aller_It.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerItIt = "fonts/aller_ItIt.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String allerRG = "fonts/aller_rg.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String amaticBold = "fonts/amatic_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String amaticSCRegular = "fonts/amatic_sc_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String antonioBold = "fonts/antonio_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String antonioLight = "fonts/antonio_light.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String antonioRegular = "fonts/antonio_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String BebasRegular = "fonts/bebas_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String blackJack = "fonts/blackjack.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String caviarDreams = "fonts/caviar_dreams.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String caviarDreamsItalic = "fonts/caviar_dreams_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String chunkFivePrint = "fonts/chunk_five_print.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String chunkFiveRegular = "fonts/chunk_five_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cooperHewittBold = "fonts/cooper_hewitt_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cooperHewittBoldItalic = "fonts/cooper_hewitt_bolditalic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cooperHewittBook = "fonts/cooper_hewitt_book.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String cooperHewittHeavy = "fonts/cooper_hewitt_Heavy.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String dancingScriptRegular = "fonts/dancing_script_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String fTusj = "fonts/fff_tusj.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String firaSansBold = "fonts/fira_sans_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String firaSansBoldItalic = "fonts/fira_sans_bold_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String firaSansBook = "fonts/fira_sans_book.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String firaSansEight = "fonts/fira_sans_eight.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String greatVibesRegular = "fonts/great_vibes_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String helloValentina = "fonts/hello_valentina.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String interBlack = "fonts/inter_black.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String interBold = "fonts/inter_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String interBoldItalic = "fonts/inter_bolditalic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String interExtraBold = "fonts/inter_extrabold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String josefinBold = "fonts/josefin_sans_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String josefinBoldItalic = "fonts/josefin_sans_bold_iItalic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String josefinLight = "fonts/josefin_sans_light.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String josefinRegular = "fonts/josefin_sans_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String josefiThin = "fonts/josefin_sans_thin.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String latoBlack = "fonts/lato_black.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String latoBlackItalic = "fonts/lato_black_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String latoBold = "fonts/lato_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String latoBoldItalic = "fonts/lato_bold_Italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String latoHairLIneItalic = "fonts/lato_hair_line_Italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String montSerratAlternatesBlack = "fonts/montserrat_alternates_black.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String montSerratAlternatesBlackItalic = "fonts/montserrat_alternates_blackItalic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String montSerratAlternatesBold = "fonts/montserrat_alternates_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansBold = "fonts/opensans_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansBoldItalic = "fonts/opensans_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansExtraBoldItalic = "fonts/opensans_extra_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansItalic = "fonts/opensans_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansLight = "fonts/opensans_light.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansRegular = "fonts/opensans_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansSemiBold = "fonts/opensans_semi_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String openSansSemiBoldItalic = "fonts/opensans_semi_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichRegular = "fonts/ostrich_regular.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansBlack = "fonts/ostrichsans_black.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansBold = "fonts/ostrichsans_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansHeavy = "fonts/ostrichsans_heavy.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansLight = "fonts/ostrichsans_light.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansMedium = "fonts/ostrichsans_medium.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ostrichSansRoundedMedium = "fonts/ostrichsansrounded_medium.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String osWaldBold = "fonts/oswald_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String osWaldBoldItalic = "fonts/oswald_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String osWaldSemiBoldItalic = "fonts/oswald_demi_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String playfairDisplayBlack = "fonts/playfair_display_black.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String playfairDisplayBlackItalic = "fonts/playfair_display_black_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String playfairDisplayBold = "fonts/Playfair_display_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String poppinBlackItalic = "fonts/poppin_-black_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String poppinBlack = "fonts/poppins_black.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String poppinBold = "fonts/poppins_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String poppinBoldItalic = "fonts/poppins_bold_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String poppinExtraBold = "fonts/poppins_extra_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ptc55 = "fonts/ptc_55.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ptc75F = "fonts/ptc_75f.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String quicksAndBold = "fonts/quicksand_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String quicksAndBoldItalic = "fonts/quicksand_bold_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String quicksDash = "fonts/quicksand_dash.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String quicksAndItalic = "fonts/quicksand_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String quicksAndLight = "fonts/quicksand_light.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayBlack = "fonts/raleway_black.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayBlackItalic = "fonts/raleway_black_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayBold = "fonts/raleway_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayBoldItalic = "fonts/raleway_bold_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayItalic = "fonts/raleway_italic.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String raleWayMedium = "fonts/raleway_medium.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String seasRn = "fonts/seasrn.ttf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String sofiaRegular = "fonts/sofia_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String sourceSansProBlackIt = "fonts/source_sans_pro_blackit.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String sourceSansProBold = "fonts/source_sans_pro_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String sourceSansProExtraLight = "fonts/source_sans_pro_extra_light.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String sourceSansProBlack = "fonts/source_sans_pro_extra_light_it.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String titiliumBold = "fonts/titillium_bold.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String titiliumLight = "fonts/titillium_light.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String titiliumRegular = "fonts/titillium_regular.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String titiliumRegularItalic = "fonts/titillium_regular_italic.otf";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String titiliumSemiBold = "fonts/titillium_semi_bold.otf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayBlack = "fonts/walkway_black.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayBold = "fonts/walkway_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayOblique = "fonts/walkway_oblique.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayObliqueBlack = "fonts/walkway_oblique_black.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayObliqueBold = "fonts/walkway_oblique_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String walkwayObliqueSemiBold = "fonts/walkway_oblique_semi_bold.ttf";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String windSong = "fonts/windsong.ttf";
    
    private CommonMethods() {
        super();
    }
    
    public final int getPERMISSION_ID() {
        return 0;
    }
    
    public final void setPERMISSION_ID(int p0) {
    }
    
    public final int getAdvanceMap_Permission_ID() {
        return 0;
    }
    
    public final void setAdvanceMap_Permission_ID(int p0) {
    }
    
    /**
     * status bar change according to screen requirement (primary color and white color)
     */
    public final void statusBar(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean isWhite) {
    }
    
    public final boolean isAdvanceMap() {
        return false;
    }
    
    public final void setAdvanceMap(boolean p0) {
    }
    
    /**
     * Common Toast Bar You can use every where in the application using context
     */
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    private final java.lang.String getColoredSpanned(java.lang.String text, java.lang.String color) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.Dialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.Nullable()
    android.app.Dialog p0) {
    }
    
    public final void showSwipeDeleteAccountDialog() {
    }
    
    /**
     * choose options click(Button)
     */
    public final int checkPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permission) {
        return 0;
    }
    
    public final boolean isLocationEnabled() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient() {
        return null;
    }
    
    public final void setMFusedLocationClient(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void requestNewLocationData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getCurrentLocation() {
        return null;
    }
    
    public final void setCurrentLocation(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    public final boolean checkPermissions() {
        return false;
    }
    
    public final void requestPermissions() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File saveBitmapToFile(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    public final void persistImage(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getDeviceToken() {
        return null;
    }
    
    public final void setDeviceToken(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAbrilFatFaceRegular() {
        return null;
    }
    
    public final void setAbrilFatFaceRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAcademyEngravedLetPlain() {
        return null;
    }
    
    public final void setAcademyEngravedLetPlain(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlexBrushRegular() {
        return null;
    }
    
    public final void setAlexBrushRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerBD() {
        return null;
    }
    
    public final void setAllerBD(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerBDLT() {
        return null;
    }
    
    public final void setAllerBDLT(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerDisplay() {
        return null;
    }
    
    public final void setAllerDisplay(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerIt() {
        return null;
    }
    
    public final void setAllerIt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerItIt() {
        return null;
    }
    
    public final void setAllerItIt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAllerRG() {
        return null;
    }
    
    public final void setAllerRG(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmaticBold() {
        return null;
    }
    
    public final void setAmaticBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAmaticSCRegular() {
        return null;
    }
    
    public final void setAmaticSCRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAntonioBold() {
        return null;
    }
    
    public final void setAntonioBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAntonioLight() {
        return null;
    }
    
    public final void setAntonioLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAntonioRegular() {
        return null;
    }
    
    public final void setAntonioRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBebasRegular() {
        return null;
    }
    
    public final void setBebasRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBlackJack() {
        return null;
    }
    
    public final void setBlackJack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCaviarDreams() {
        return null;
    }
    
    public final void setCaviarDreams(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCaviarDreamsItalic() {
        return null;
    }
    
    public final void setCaviarDreamsItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChunkFivePrint() {
        return null;
    }
    
    public final void setChunkFivePrint(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChunkFiveRegular() {
        return null;
    }
    
    public final void setChunkFiveRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCooperHewittBold() {
        return null;
    }
    
    public final void setCooperHewittBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCooperHewittBoldItalic() {
        return null;
    }
    
    public final void setCooperHewittBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCooperHewittBook() {
        return null;
    }
    
    public final void setCooperHewittBook(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCooperHewittHeavy() {
        return null;
    }
    
    public final void setCooperHewittHeavy(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDancingScriptRegular() {
        return null;
    }
    
    public final void setDancingScriptRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFTusj() {
        return null;
    }
    
    public final void setFTusj(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiraSansBold() {
        return null;
    }
    
    public final void setFiraSansBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiraSansBoldItalic() {
        return null;
    }
    
    public final void setFiraSansBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiraSansBook() {
        return null;
    }
    
    public final void setFiraSansBook(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiraSansEight() {
        return null;
    }
    
    public final void setFiraSansEight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGreatVibesRegular() {
        return null;
    }
    
    public final void setGreatVibesRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHelloValentina() {
        return null;
    }
    
    public final void setHelloValentina(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInterBlack() {
        return null;
    }
    
    public final void setInterBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInterBold() {
        return null;
    }
    
    public final void setInterBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInterBoldItalic() {
        return null;
    }
    
    public final void setInterBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getInterExtraBold() {
        return null;
    }
    
    public final void setInterExtraBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJosefinBold() {
        return null;
    }
    
    public final void setJosefinBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJosefinBoldItalic() {
        return null;
    }
    
    public final void setJosefinBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJosefinLight() {
        return null;
    }
    
    public final void setJosefinLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJosefinRegular() {
        return null;
    }
    
    public final void setJosefinRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getJosefiThin() {
        return null;
    }
    
    public final void setJosefiThin(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatoBlack() {
        return null;
    }
    
    public final void setLatoBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatoBlackItalic() {
        return null;
    }
    
    public final void setLatoBlackItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatoBold() {
        return null;
    }
    
    public final void setLatoBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatoBoldItalic() {
        return null;
    }
    
    public final void setLatoBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLatoHairLIneItalic() {
        return null;
    }
    
    public final void setLatoHairLIneItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMontSerratAlternatesBlack() {
        return null;
    }
    
    public final void setMontSerratAlternatesBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMontSerratAlternatesBlackItalic() {
        return null;
    }
    
    public final void setMontSerratAlternatesBlackItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMontSerratAlternatesBold() {
        return null;
    }
    
    public final void setMontSerratAlternatesBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansBold() {
        return null;
    }
    
    public final void setOpenSansBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansBoldItalic() {
        return null;
    }
    
    public final void setOpenSansBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansExtraBoldItalic() {
        return null;
    }
    
    public final void setOpenSansExtraBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansItalic() {
        return null;
    }
    
    public final void setOpenSansItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansLight() {
        return null;
    }
    
    public final void setOpenSansLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansRegular() {
        return null;
    }
    
    public final void setOpenSansRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansSemiBold() {
        return null;
    }
    
    public final void setOpenSansSemiBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOpenSansSemiBoldItalic() {
        return null;
    }
    
    public final void setOpenSansSemiBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichRegular() {
        return null;
    }
    
    public final void setOstrichRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansBlack() {
        return null;
    }
    
    public final void setOstrichSansBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansBold() {
        return null;
    }
    
    public final void setOstrichSansBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansHeavy() {
        return null;
    }
    
    public final void setOstrichSansHeavy(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansLight() {
        return null;
    }
    
    public final void setOstrichSansLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansMedium() {
        return null;
    }
    
    public final void setOstrichSansMedium(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOstrichSansRoundedMedium() {
        return null;
    }
    
    public final void setOstrichSansRoundedMedium(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOsWaldBold() {
        return null;
    }
    
    public final void setOsWaldBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOsWaldBoldItalic() {
        return null;
    }
    
    public final void setOsWaldBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOsWaldSemiBoldItalic() {
        return null;
    }
    
    public final void setOsWaldSemiBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlayfairDisplayBlack() {
        return null;
    }
    
    public final void setPlayfairDisplayBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlayfairDisplayBlackItalic() {
        return null;
    }
    
    public final void setPlayfairDisplayBlackItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlayfairDisplayBold() {
        return null;
    }
    
    public final void setPlayfairDisplayBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoppinBlackItalic() {
        return null;
    }
    
    public final void setPoppinBlackItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoppinBlack() {
        return null;
    }
    
    public final void setPoppinBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoppinBold() {
        return null;
    }
    
    public final void setPoppinBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoppinBoldItalic() {
        return null;
    }
    
    public final void setPoppinBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoppinExtraBold() {
        return null;
    }
    
    public final void setPoppinExtraBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPtc55() {
        return null;
    }
    
    public final void setPtc55(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPtc75F() {
        return null;
    }
    
    public final void setPtc75F(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuicksAndBold() {
        return null;
    }
    
    public final void setQuicksAndBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuicksAndBoldItalic() {
        return null;
    }
    
    public final void setQuicksAndBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuicksDash() {
        return null;
    }
    
    public final void setQuicksDash(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuicksAndItalic() {
        return null;
    }
    
    public final void setQuicksAndItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQuicksAndLight() {
        return null;
    }
    
    public final void setQuicksAndLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayBlack() {
        return null;
    }
    
    public final void setRaleWayBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayBlackItalic() {
        return null;
    }
    
    public final void setRaleWayBlackItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayBold() {
        return null;
    }
    
    public final void setRaleWayBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayBoldItalic() {
        return null;
    }
    
    public final void setRaleWayBoldItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayItalic() {
        return null;
    }
    
    public final void setRaleWayItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRaleWayMedium() {
        return null;
    }
    
    public final void setRaleWayMedium(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSeasRn() {
        return null;
    }
    
    public final void setSeasRn(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSofiaRegular() {
        return null;
    }
    
    public final void setSofiaRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceSansProBlackIt() {
        return null;
    }
    
    public final void setSourceSansProBlackIt(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceSansProBold() {
        return null;
    }
    
    public final void setSourceSansProBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceSansProExtraLight() {
        return null;
    }
    
    public final void setSourceSansProExtraLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSourceSansProBlack() {
        return null;
    }
    
    public final void setSourceSansProBlack(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitiliumBold() {
        return null;
    }
    
    public final void setTitiliumBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitiliumLight() {
        return null;
    }
    
    public final void setTitiliumLight(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitiliumRegular() {
        return null;
    }
    
    public final void setTitiliumRegular(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitiliumRegularItalic() {
        return null;
    }
    
    public final void setTitiliumRegularItalic(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitiliumSemiBold() {
        return null;
    }
    
    public final void setTitiliumSemiBold(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}