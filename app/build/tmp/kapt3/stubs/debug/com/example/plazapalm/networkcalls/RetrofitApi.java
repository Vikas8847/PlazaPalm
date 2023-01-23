package com.example.plazapalm.networkcalls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00c8\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J5\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJm\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u00062\b\b\u0001\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00062\u0018\b\u0001\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ;\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ5\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u00062\b\b\u0001\u0010#\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ9\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\'\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*Jm\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u00062\b\b\u0001\u0010/\u001a\u00020\u00062\b\b\u0001\u00100\u001a\u00020\u00062\b\b\u0001\u00101\u001a\u00020\u00062\u0018\b\u0001\u00102\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJE\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00106\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u00107\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J!\u00109\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J+\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J+\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010>\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J+\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010A\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J+\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J#\u0010E\u001a\b\u0012\u0004\u0012\u00020%0\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J+\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\"\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J?\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010J\u001a\u00020K2\b\b\u0001\u0010L\u001a\u00020K2\b\b\u0001\u0010-\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJS\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010P\u001a\u00020Q2\b\b\u0001\u0010R\u001a\u00020Q2\b\b\u0001\u0010S\u001a\u00020K2\b\b\u0001\u0010T\u001a\u00020K2\b\b\u0001\u0010U\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010VJ7\u0010W\u001a\b\u0012\u0004\u0012\u00020X0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010Y\u001a\u00020Q2\b\b\u0001\u0010Z\u001a\u00020QH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010[J!\u0010\\\u001a\b\u0012\u0004\u0012\u00020]0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J?\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010P\u001a\u00020`2\b\b\u0001\u0010R\u001a\u00020`H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010aJ#\u0010b\u001a\b\u0012\u0004\u0012\u00020c0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*Jw\u0010d\u001a\b\u0012\u0004\u0012\u00020e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0018\b\u0001\u0010f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u001a2\b\b\u0001\u0010g\u001a\u00020K2\b\b\u0001\u0010h\u001a\u00020K2\b\b\u0001\u0010Y\u001a\u00020Q2\b\b\u0001\u0010Z\u001a\u00020Q2\b\b\u0001\u0010i\u001a\u00020\u00062\b\b\u0001\u0010j\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010kJ!\u0010l\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J?\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010o\u001a\u00020\u000e2\b\b\u0001\u0010p\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010qJ+\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J9\u0010t\u001a\b\u0012\u0004\u0012\u00020u0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u0010v\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJG\u0010x\u001a\b\u0012\u0004\u0012\u00020y0\u00032\n\b\u0003\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010z\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010v\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010w\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J!\u0010{\u001a\b\u0012\u0004\u0012\u00020|0\u00032\b\b\u0001\u0010}\u001a\u00020~H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u007fJ\u009d\u0001\u0010\u0080\u0001\u001a\t\u0012\u0005\u0012\u00030\u0081\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\t\b\u0001\u0010\u0082\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u0083\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u0084\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u0085\u0001\u001a\u00020Q2\t\b\u0001\u0010\u0086\u0001\u001a\u00020Q2\t\b\u0001\u0010\u0087\u0001\u001a\u00020`2\t\b\u0001\u0010\u0088\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u008a\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u008b\u0001\u001a\u00020K2\t\b\u0001\u0010\u008c\u0001\u001a\u00020QH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u008d\u0001J\u00f2\u0001\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008f\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00062\u0019\b\u0001\u0010\u0095\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u001a2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\u00062\u000b\b\u0001\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u009c\u0001J$\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*JC\u0010\u009e\u0001\u001a\t\u0012\u0005\u0012\u00030\u009f\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\t\b\u0001\u0010\u00a0\u0001\u001a\u00020\u00062\t\b\u0001\u0010\u00a1\u0001\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J0\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<Jq\u0010\u00a3\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a4\u00010\u00032\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010z\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010v\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010w\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00a6\u0001J.\u0010\u00a7\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<JY\u0010\u00a8\u0001\u001a\b\u0012\u0004\u0012\u00020c0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0003\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00ab\u0001J6\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010D\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u00fe\u0001\u0010\u00ad\u0001\u001a\t\u0012\u0005\u0012\u00030\u00ae\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010Z\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00062\u0019\b\u0001\u0010\u0095\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u001a2\t\b\u0001\u0010\u0096\u0001\u001a\u00020\u00062\u000b\b\u0001\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010Y\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00af\u0001J2\u0010\u00b0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u00b2\u0001\u001a\u00030\u00b3\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b4\u0001J;\u0010\u00b5\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0013\b\u0001\u0010\u00b2\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u00b3\u00010\u00b6\u0001H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0003\u0010\u00b7\u0001J=\u0010\u00b8\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ2\u0010\u00ba\u0001\u001a\t\u0012\u0005\u0012\u00030\u00bb\u00010\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<J1\u0010\u00bc\u0001\u001a\b\u0012\u0004\u0012\u00020%0\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u00010\u00062\u000b\b\u0001\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00bd\u0001"}, d2 = {"Lcom/example/plazapalm/networkcalls/RetrofitApi;", "", "addQuestion", "Lretrofit2/Response;", "Lcom/example/plazapalm/models/AddQuestionResponseModel;", "Authorization", "", "p_id", "question_text", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToBlocklist", "Lcom/example/plazapalm/models/BlockUserResponse;", "u_id", "isBlocked", "", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToCalendarBooking", "Lcom/example/plazapalm/models/AddToCalendarResponseModel;", "Category_Name", "Choose_Date", "Post_Profile_Id", "Choose_Time", "Description", "Question_Answer", "Ljava/util/ArrayList;", "Lcom/example/plazapalm/models/QuestionAnswer;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addtoFav", "Lcom/example/plazapalm/models/AddFavPostProfileResponse;", "favType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bookingStatusInput", "Lcom/example/plazapalm/models/BookingStatusInputResponse;", "booking_id", "booking_status", "changePassword", "Lcom/example/plazapalm/models/VerifyOtpData;", "CurrentPassword", "NewPassword", "colorLookGet", "Lcom/example/plazapalm/models/GetColorsResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "conBookProfileSave", "Lcom/example/plazapalm/models/ConfirmBookingProfileResponse;", "post_profile_id", "choose_date", "choose_time", "description", "category_name", "question_answer", "contactUs", "Lcom/example/plazapalm/models/ContactUsResponseModel;", "Email", "Subject", "Message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccount", "deleteBooking", "Lcom/example/plazapalm/models/DeleteBookingResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFromCalendar", "Booking_Id", "deleteProfilePost", "Lcom/example/plazapalm/models/DeletePostProfileResponse;", "name", "deleteQuestion", "Lcom/example/plazapalm/models/DeleteQuestionsResponse;", "question_id", "forgotPassword", "getBookingDetailsForCustomer", "Lcom/example/plazapalm/models/BookingDetailsResponse;", "getCalendarBookingDateMonthWiseForBoth", "Lcom/example/plazapalm/models/GetCalanderResponseModel;", "month", "", "year", "(Ljava/lang/String;IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCategories", "Lcom/example/plazapalm/models/CategoriesResponseModel;", "Lat", "", "Long", "OffSet", "Limit", "Search", "(Ljava/lang/String;DDIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavDetals", "Lcom/example/plazapalm/models/GetFavResponse;", "lat", "long", "(Ljava/lang/String;DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFonts", "Lcom/example/plazapalm/models/GetFontResponse;", "getPostProfile", "Lcom/example/plazapalm/models/GetPostProfileResponse;", "", "(Ljava/lang/String;Ljava/lang/String;FFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProfileApi", "Lcom/example/plazapalm/models/GetProfileResponseModel;", "getProfileByCategory", "Lcom/example/plazapalm/models/GetProfileCateResponse;", "c_id", "offset", "limit", "search", "miles", "(Ljava/lang/String;Ljava/util/ArrayList;IIDDLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPremiumStatus", "likesDislikes", "Lcom/example/plazapalm/models/LikesResPonse;", "likeStatus", "dislikeStatus", "(Ljava/lang/String;Ljava/lang/String;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listQuestion", "Lcom/example/plazapalm/models/GetQuestionsListResponse;", "logOutUser", "Lcom/example/plazapalm/models/UserLogoutModel;", "DeviceToken", "DeviceType", "loginApi", "Lcom/example/plazapalm/models/LoginDataModel;", "Password", "mapFeatreData", "Lcom/example/plazapalm/models/MapFeaturedDataRes;", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postEditLookColors", "Lcom/example/plazapalm/models/EditLookColorsResponse;", "backgroundColor", "backgroundType", "columnColor", "columnOpacity", "borderOpacity", "borderWidth", "borderColor", "fontName", "fontColor", "fontSize", "fontOpacity", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postProfile", "Lcom/example/plazapalm/models/SavePostProfileResponse;", "FirstName", "LastName", "expiry_date", "address", "location_text", "image_url", "user_name", "tags", "description_2", "description_1", "description_3", "profile_title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reSendOtp", "report", "Lcom/example/plazapalm/models/ReportResponse;", "reportText", "note", "resetPassword", "signUp", "Lcom/example/plazapalm/models/SignupResponseModel;", "business_profile_status", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateEmail", "updateProfile", "ImageUrl", "Notification", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuestion", "updatepostProfile", "Lcom/example/plazapalm/models/UpdateProfileResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadMedia", "Lcom/example/plazapalm/models/UploadMediaResponse;", "images", "Lokhttp3/MultipartBody$Part;", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadMediaPostProfile", "", "(Ljava/lang/String;[Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateOtpUpdateEmail", "Otp", "validateUserName", "Lcom/example/plazapalm/models/ValidateUserNameResponse;", "verifyOtp", "app_debug"})
public abstract interface RetrofitApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "sign-up")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "first_name")
    java.lang.String FirstName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "last_name")
    java.lang.String LastName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String Password, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_token")
    java.lang.String DeviceToken, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String DeviceType, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "business_profile_status")
    java.lang.Boolean business_profile_status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.SignupResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "verifyOtp")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object verifyOtp(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "otp")
    java.lang.String Otp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "resendOtp")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object reSendOtp(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "forgotPassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object forgotPassword(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object loginApi(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String Password, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_token")
    java.lang.String DeviceToken, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String DeviceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.LoginDataModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "changePassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object changePassword(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "currentPassword")
    java.lang.String CurrentPassword, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "newPassword")
    java.lang.String NewPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "contactUs")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object contactUs(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "subject")
    java.lang.String Subject, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "message")
    java.lang.String Message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.ContactUsResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "deleteUserAccount")
    public abstract java.lang.Object deleteAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "updateEmail")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object updateEmail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "logout")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object logOutUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_token")
    java.lang.String DeviceToken, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "device_type")
    java.lang.String DeviceType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.UserLogoutModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "resetPassword")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object resetPassword(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String Password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getProfile")
    public abstract java.lang.Object getProfileApi(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetProfileResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "updateProfile")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object updateProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "first_name")
    java.lang.String FirstName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "last_name")
    java.lang.String LastName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "image_url")
    java.lang.String ImageUrl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "notification")
    java.lang.Boolean Notification, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetProfileResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "validateOtpForUpdateEmail")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object validateOtpUpdateEmail(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String Email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "otp")
    java.lang.String Otp, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.VerifyOtpData>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "uploadMedia")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object uploadMedia(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part images, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.UploadMediaResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getCategory")
    public abstract java.lang.Object getCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @retrofit2.http.Query(value = "lat")
    double Lat, @retrofit2.http.Query(value = "long")
    double Long, @retrofit2.http.Query(value = "offset")
    int OffSet, @retrofit2.http.Query(value = "limit")
    int Limit, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String Search, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.CategoriesResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "isPremiumStatus")
    public abstract java.lang.Object isPremiumStatus(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.CategoriesResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "getProfileByCategory")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object getProfileByCategory(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "c_id")
    java.util.ArrayList<java.lang.String> c_id, @retrofit2.http.Field(value = "offset")
    int offset, @retrofit2.http.Field(value = "limit")
    int limit, @retrofit2.http.Field(value = "lat")
    double lat, @retrofit2.http.Field(value = "long")
    double p5_1663806, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "search")
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "miles")
    java.lang.String miles, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetProfileCateResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "postProfileSave")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object postProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "first_name")
    java.lang.String FirstName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "last_name")
    java.lang.String LastName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "long")
    java.lang.String p3_1663806, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "expiry_date")
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "address")
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "location_text")
    java.lang.String location_text, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "image_url")
    java.util.ArrayList<java.lang.String> image_url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_name")
    java.lang.String user_name, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "tags")
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_2")
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_1")
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_3")
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "profile_title")
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "c_id")
    java.lang.String c_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.SavePostProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "validateUserName")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object validateUserName(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "user_name")
    java.lang.String user_name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.ValidateUserNameResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getPostProfile")
    public abstract java.lang.Object getPostProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "p_id")
    java.lang.String p_id, @retrofit2.http.Query(value = "lat")
    float Lat, @retrofit2.http.Query(value = "long")
    float Long, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetPostProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "postProfileDelete/{name}")
    public abstract java.lang.Object deleteProfilePost(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.DeletePostProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "uploadMedia")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object uploadMediaPostProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part[] images, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.UploadMediaResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "postProfileUpdate")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object updatepostProfile(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "first_name")
    java.lang.String FirstName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "last_name")
    java.lang.String LastName, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "long")
    java.lang.String p3_1663806, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "expiry_date")
    java.lang.String expiry_date, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "address")
    java.lang.String address, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "location_text")
    java.lang.String location_text, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "image_url")
    java.util.ArrayList<java.lang.String> image_url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "user_name")
    java.lang.String user_name, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "tags")
    java.lang.String tags, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_2")
    java.lang.String description_2, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_1")
    java.lang.String description_1, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "description_3")
    java.lang.String description_3, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "lat")
    java.lang.String lat, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "profile_title")
    java.lang.String profile_title, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "c_id")
    java.lang.String c_id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "p_id")
    java.lang.String p_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.UpdateProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addFavourites")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object addtoFav(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "p_id")
    java.lang.String p_id, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "favType")
    java.lang.Boolean favType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.AddFavPostProfileResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "listFavourites")
    public abstract java.lang.Object getFavDetals(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "long")
    double p2_1663806, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetFavResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "likesDislikes")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object likesDislikes(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "p_id")
    java.lang.String p_id, @retrofit2.http.Field(value = "likeStatus")
    boolean likeStatus, @retrofit2.http.Field(value = "dislikeStatus")
    boolean dislikeStatus, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.LikesResPonse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "report")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object report(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "p_id")
    java.lang.String p_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "reportText")
    java.lang.String reportText, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "note")
    java.lang.String note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.ReportResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addQuestion")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object addQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "p_id")
    java.lang.String p_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "question_text")
    java.lang.String question_text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.AddQuestionResponseModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addToCalender")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object addToCalendarBooking(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "category_name")
    java.lang.String Category_Name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "choose_date")
    java.lang.String Choose_Date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "post_profile_id")
    java.lang.String Post_Profile_Id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "choose_time")
    java.lang.String Choose_Time, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "description")
    java.lang.String Description, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "question_answer")
    java.util.ArrayList<com.example.plazapalm.models.QuestionAnswer> Question_Answer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.AddToCalendarResponseModel>> continuation);
    
    /**
     * Delete Account api..
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "removeFromCalender")
    public abstract java.lang.Object deleteFromCalendar(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "booking_id")
    java.lang.String Booking_Id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.AddToCalendarResponseModel>> continuation);
    
    /**
     * Confirm Booking Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "bookProfileSave")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object conBookProfileSave(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "post_profile_id")
    java.lang.String post_profile_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "choose_date")
    java.lang.String choose_date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "choose_time")
    java.lang.String choose_time, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "description")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "category_name")
    java.lang.String category_name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "question_answer")
    java.util.ArrayList<com.example.plazapalm.models.QuestionAnswer> question_answer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.ConfirmBookingProfileResponse>> continuation);
    
    /**
     * GetCalendarBookingDateMonthWiseForBoth Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getBookingDateMonthWiseForBoth")
    public abstract java.lang.Object getCalendarBookingDateMonthWiseForBoth(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @retrofit2.http.Query(value = "month")
    int month, @retrofit2.http.Query(value = "year")
    int year, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "post_profile_id ")
    java.lang.String post_profile_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetCalanderResponseModel>> continuation);
    
    /**
     * AddToBlocklist Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "addToBlocklist")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object addToBlocklist(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "u_id")
    java.lang.String u_id, @retrofit2.http.Field(value = "isBlocked")
    boolean isBlocked, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.BlockUserResponse>> continuation);
    
    /**
     * GetBookingDetailsForCustomer Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "getBookingDetailsForCustomer")
    public abstract java.lang.Object getBookingDetailsForCustomer(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "booking_id")
    java.lang.String booking_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.BookingDetailsResponse>> continuation);
    
    /**
     * Booking StatusInput Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "bookingStatusInput")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object bookingStatusInput(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "booking_id")
    java.lang.String booking_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "booking_status")
    java.lang.String booking_status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.BookingStatusInputResponse>> continuation);
    
    /**
     * Delete Booking Api
     */
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "deleteBooking")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object deleteBooking(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "booking_id")
    java.lang.String booking_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.DeleteBookingResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "listQuestion/{p_id}")
    public abstract java.lang.Object listQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "p_id")
    java.lang.String p_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetQuestionsListResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.DELETE(value = "deleteQuestion")
    public abstract java.lang.Object deleteQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "question_id")
    java.lang.String question_id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.DeleteQuestionsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "updateQuestion")
    public abstract java.lang.Object updateQuestion(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "question_id")
    java.lang.String question_id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "question_text")
    java.lang.String question_text, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.DeleteQuestionsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "colorLook")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object postEditLookColors(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "backgroundColor")
    java.lang.String backgroundColor, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "backgroundType")
    java.lang.String backgroundType, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "columnColor")
    java.lang.String columnColor, @retrofit2.http.Field(value = "columnOpacity")
    double columnOpacity, @retrofit2.http.Field(value = "borderOpacity")
    double borderOpacity, @retrofit2.http.Field(value = "borderWidth")
    float borderWidth, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "borderColor")
    java.lang.String borderColor, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "fontName")
    java.lang.String fontName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "fontColor")
    java.lang.String fontColor, @retrofit2.http.Field(value = "fontSize")
    int fontSize, @retrofit2.http.Field(value = "fontOpacity")
    double fontOpacity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.EditLookColorsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "colorLookGet")
    public abstract java.lang.Object colorLookGet(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetColorsResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "mapFeature")
    public abstract java.lang.Object mapFeatreData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    org.json.JSONObject jsonObject, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.MapFeaturedDataRes>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "frontPageGet")
    public abstract java.lang.Object getFonts(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String Authorization, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.plazapalm.models.GetFontResponse>> continuation);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 3)
    public final class DefaultImpls {
    }
}